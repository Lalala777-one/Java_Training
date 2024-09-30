package lesson_04;

public class Test1 {

    public static void main(String[] args) {
        int x = 27;
        int y = 7;

        double result;

        result = x / y;

        System.out.println("Result is " + result);

        result = x / 7.0;

        System.out.println("New result is " + result);

        result = (float) x / y;  // результат деления будет float
        System.out.println("Result float cast " + result);    // этот resalt будет типа данных double потому что изная перем result типа данных double
    // происходит автоматическое приведение float к double

        result = x / (double) y; // результат деления будет double
        System.out.println("Result double cast " + result);
    }


}
