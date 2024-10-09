package homework_20;

public class Rectangle extends Shape {
    /*
     Создайте класс Rectangle, который наследуется от Shape. • Добавьте поля width и height типа double,
     которые хранят размеры прямоугольника. • Создайте метод setDimensions(double width, double height),
     который устанавливает  значения полей width и height. • Создайте метод calculateArea(), который
      вычисляет и выводит площадь прямоугольника.
     */

    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public double calculateArea() {
        double area = width * height;
        return area;

    }
}







