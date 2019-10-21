package task.util;

import task.model.TriangleModel;

import java.util.Collections;
import java.util.List;

public class Output {

    public void inputInfo() {
        System.out.println("Введите параметры Name, sideA, sideB, sideC" +
                " через запятую: ");
    }

    public void createNewTriangleInfo() {
        System.out.println("Попытка создания треугольника");
    }

    public void errorCreateTriangleInfo() {
        System.out.println("Ошибка создания!! Некорректно введены данные");
    }

    public void addToListInfo() {
        System.out.println("Добавление треугольника в массив");
    }

    public void errorAddToListInfo() {
        System.out.println("Ошибка добавления треугольника в массив");
    }

    public void errorIsTriangleExist() {
        System.out.println("Треугольника с такими сторонами не существует!!");
    }

    public void outPutSortCollection(List<TriangleModel> triangleList){
        System.out.println("============= Triangles list: ===============");
        Collections.sort(triangleList,Collections.reverseOrder());
        for(TriangleModel triangle : triangleList){
            System.out.println(triangle);
        }
    }

}
