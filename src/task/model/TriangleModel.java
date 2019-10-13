package task.model;

public class TriangleModel implements Comparable<TriangleModel> {

    private String name;
    private float sideA, sideB, sideC;
    private double S;

    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public String getName() {
        return name;
    }

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public TriangleModel(String name, float sideA, float sideB, float sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int compareTo(TriangleModel triangle) {
        if(this.getS()>triangle.getS()){
            return 1;
        }
        else if (this.getS()<triangle.getS()){
            return -1;
        }
        else return 0;
    }

    @Override
    public String toString(){
        return "["+this.getName()+"]: " + this.getS() +" cm";
    }
}
