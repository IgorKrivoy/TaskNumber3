package task.service;

import task.model.TriangleModel;

public class Service {

    public void areaOfTriangle(TriangleModel triangle) {
        double p;
        float a,b,c;
        a = triangle.getSideA();
        b = triangle.getSideB();
        c = triangle.getSideC();
        p = (a + b + c) / 2;
        triangle.setS(Math.sqrt(p * (p - a)*(p - b)*(p - c)));
    }

}
