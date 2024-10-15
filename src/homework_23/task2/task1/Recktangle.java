package homework_23.task2.task1;

public class Recktangle extends Shape {

    private double sideA;

    private double sideB;


    public Recktangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.type = "Recktangle";

    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return (sideA + sideB) *2 ;
    }
}
