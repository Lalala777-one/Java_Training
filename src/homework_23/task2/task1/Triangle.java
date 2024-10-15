package homework_23.task2.task1;

public class Triangle extends  Shape{

 private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = "Triangle";

        if(!isValidSides()){
            // стороны неравильные. невозможно построить треугольник
            System.out.println("Построить треугольник с такими сторонами невозможно!");

            //TODO надо выбросить ошибку или закрыть конструктор
            //
            // устанавливаем значения по умолчанию
            this.sideA = 3;
            this.sideB = 4;
            this.sideC = 5;
        }
    }

    private boolean isValidSides(){
      return   sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideC > sideA;
    }

    @Override
    public double area() {
        // полупериметр
        double p2 = perimeter() / 2;
        double area = Math.sqrt(p2 * (p2 - sideA) * (p2 - sideB) * (p2 - sideC));
        return area;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
