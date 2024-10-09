package homework_19;

import static homework_19.Calculator_HM19.squareCircle;

public class Calculator_HM19 {

    public static final double PI = 3.141519;

    public static double circumference(int radius){
        return 2 * PI * radius;
    }

    public static double squareCircle(int radius){
        return PI * (radius * radius);
    }

    public static int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public static double sumOfNumbers(double a, double b) {
        return a + b;
    }

    public static int subtractionOfNumbers(int a, int b) {
        return a - b;
    }

    public static double subtractionOfNumbers(double a, double b) {
        return a - b;
    }

    public static int productOfNumbers(int a, int b) {
        return a * b;
    }

    public static double productOfNumbers(double a, double b) {
        return a * b;

    }

    public static double divisionOfNumbers(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } throw new ArithmeticException("Деление на 0 запрещено");

    }

    public static double divisionOfNumbers(double a, double b) {

        return a / b;
    }
}

class CalculatorTest{
    public static void main(String[] args) {

        System.out.println( squareCircle(2));
    }
}



