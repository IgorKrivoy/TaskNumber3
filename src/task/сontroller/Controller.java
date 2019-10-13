package task.сontroller;

import task.model.*;
import task.service.*;
import task.util.*;

import java.util.List;

public class Controller {

    private Input input = new Input();
    private Output output = new Output();
    private Validator validator = new Validator();
    private Service service = new Service();
    private TriangleModel triangle;


    public String[] InputAndSplit() {
        output.InputInfo();
        return validator.splitToArr(input.getString());
    }

    public TriangleModel CreateNewTriangle(String[] strArr) {
        output.CreateNewTriangleInfo();
        float sideA, sideB, sideC;
        sideA = validator.parseFloat(strArr[1]);
        sideB = validator.parseFloat(strArr[2]);
        sideC = validator.parseFloat(strArr[3]);

        if (strArr.length == 4 && validator.isCorrectSide(sideA, sideB, sideC)) {
            if (validator.isTriangleExist(sideA, sideB, sideC)) {
                triangle = new TriangleModel(strArr[0], sideA, sideB, sideC);
                service.AreaOfTriangle(triangle);
                return triangle;
            } else {
                output.ErrorIsTriangleExist();
                return null;
            }
        } else {
            output.ErrorCreateTriangleInfo();
            return null;
        }
    }

    public void AddToListNewTriangle(List<TriangleModel> triangleList) {
        output.AddToListInfo();
        TriangleModel newModel = CreateNewTriangle(InputAndSplit());
        if (newModel != null) {
            triangleList.add(newModel);
        } else {
            output.ErrorAddToListInfo();
        }
    }

    public void SortCollection(List<TriangleModel> triangleList) {
        output.OutPutSortCollection(triangleList);
    }

    public boolean ToRetry() {
        return validator.ContinueConfirm(input.getString());
    }
}
