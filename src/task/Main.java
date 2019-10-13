package task;

import task.model.TriangleModel;
import task.сontroller.Controller;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<TriangleModel> triangleList = new ArrayList<>();

    public static void main(String[] args) {
        for(;;) {
            Controller controller = new Controller();
            controller.AddToListNewTriangle(triangleList);
            controller.SortCollection(triangleList);
            if(!controller.ToRetry()){
                break;
            }
        }
    }
}
