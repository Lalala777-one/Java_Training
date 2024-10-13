package homework22.Task1.Task3;

public class Circle extends Figure{

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double square = Math.PI * radius * radius;
        System.out.printf("Площадь %s : %.2f%n", name, square);
        return square;
    }
}
