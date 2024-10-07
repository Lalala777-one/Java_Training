package homework_18;

public class Calculator {
    /*
    Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
     */

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
        }
        throw new ArithmeticException("Деление на 0 запрещено");
    }

    public static double divisionOfNumbers(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        throw new ArithmeticException("Деление на 0 запрещено");
    }
}
