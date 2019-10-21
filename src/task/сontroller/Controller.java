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


    public String[] inputAndSplit() {
        output.inputInfo();
        return validator.splitToArr(input.getString());
    }

    public TriangleModel createNewTriangle(String[] strArr) {
        output.createNewTriangleInfo();
        float sideA, sideB, sideC;
        sideA = validator.parseFloat(strArr[1]);
        sideB = validator.parseFloat(strArr[2]);
        sideC = validator.parseFloat(strArr[3]);

        if (strArr.length == 4 && validator.isCorrectSide(sideA, sideB, sideC)) {
            if (validator.isTriangleExist(sideA, sideB, sideC)) {
                triangle = new TriangleModel(strArr[0], sideA, sideB, sideC);
                service.areaOfTriangle(triangle);
                return triangle;
            } else {
                output.errorIsTriangleExist();
                return null;
            }
        } else {
            output.errorCreateTriangleInfo();
            return null;
        }
    }

    public void addToListNewTriangle(List<TriangleModel> triangleList) {
        output.addToListInfo();
        TriangleModel newModel = createNewTriangle(inputAndSplit());
        if (newModel != null) {
            triangleList.add(newModel);
        } else {
            output.errorAddToListInfo();
        }
    }

    public void sortCollection(List<TriangleModel> triangleList) {
        output.outPutSortCollection(triangleList);
    }

    public boolean toRetry() {
        return validator.continueConfirm(input.getString());
    }
}
