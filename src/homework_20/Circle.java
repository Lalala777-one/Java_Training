package homework_20;

public class Circle extends Shape {
    /*
    Создайте класс Circle, который наследуется от Shape. • Добавьте поле radius типа double,
     которое хранит радиус круга. • Создайте метод setRadius(double radius), который устанавливает значение поля radius.
      • Создайте метод calculateArea(), который вычисляет и выводит площадь круга.

     */

    private double radius;
    public static final double PI = 3.141519;

    public Circle(String name) {
        super(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double areaCircle = PI * radius;
        return areaCircle;
    }


}


