package homework_28.task1;

import lesson_28.equels.Employee;

import java.util.List;
import java.util.Objects;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // "Прямоугольник [длина=..., ширина=...]".
    @Override
    public String toString() {
        return "Прямоугольник [" +
                "длина=" + length +
                ", ширина=" + width +
                "]";
    }


    // TASK 2 Сравнение объектов класса “Rectangle”


    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Rectangle)) return false; // проверка на возможность привести к Rectangle
        Rectangle rectangle = (Rectangle) obj;
        return Objects.equals(length, rectangle.length) &&
                Objects.equals(width, rectangle.width);
    }

    // TASK 3
// Метод должен удалить из списка все объекты, которые равны переданному объекту (используя переопределённый метод equals()).
    private static void removeDuplicates (List<Rectangle> rectangleList , Rectangle rectangle){
        for (int i = 0; i < rectangle.length; i++) {


        }

    }


}


