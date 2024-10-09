package homework_20;

public class Shape {
    /*
    Базовый класс Shape

• Создайте класс Shape. • Добавьте поле name типа String,
 которое хранит название фигуры. • Создайте метод displayInfo(), который выводит на экран значение поля name.
     */

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.print(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
