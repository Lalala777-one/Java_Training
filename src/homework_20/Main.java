package homework_20;

public class Main {
    /*
    Класс Main

• В методе main создайте объекты классов Rectangle и Circle. •
 Установите значения для их полей с помощью соответствующих методов. •
  Установите имя фигуры, используя поле name, унаследованное от класса Shape. •
Вызовите метод displayInfo() и методы вычисления площади для каждого объекта,
 чтобы вывести информацию о фигуре и её площади.
     */

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setDimensions(5, 10);
        System.out.println(rectangle.getName() + ", calculateArea: " + rectangle.calculateArea());

        Circle circle = new Circle("Circle");
        circle.setRadius(12);
        circle.displayInfo();
        System.out.println( ", calculateArea: " + circle.calculateArea());





    }
}
