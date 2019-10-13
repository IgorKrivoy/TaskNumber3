package task.util;

import task.model.TriangleModel;

import java.util.Collections;
import java.util.List;

public class Output {

    public void InputInfo() {
        System.out.println("Введите параметры Name, sideA, sideB, sideC" +
                " через запятую: ");
    }

    public void CreateNewTriangleInfo() {
        System.out.println("Попытка создания треугольника");
    }

    public void ErrorCreateTriangleInfo() {
        System.out.println("Ошибка создания!! Некорректно введены данные");
    }

    public void AddToListInfo() {
        System.out.println("Добавление треугольника в массив");
    }

    public void ErrorAddToListInfo() {
        System.out.println("Ошибка добавления треугольника в массив");
    }

    public void ErrorIsTriangleExist() {
        System.out.println("Треугольника с такими сторонами не существует!!");
    }

    public void OutPutSortCollection(List<TriangleModel> triangleList){
        System.out.println("============= Triangles list: ===============");
        Collections.sort(triangleList,Collections.reverseOrder());
        for(TriangleModel triangle : triangleList){
            System.out.println(triangle);
        }
    }

}
