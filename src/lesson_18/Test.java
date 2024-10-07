package lesson_18;

public class Test {

    int x;

    static int staticY;

    public void testNonStatic() {
        x++;
        staticY++;
        testStatic();
        testNonStatic();
    }

    public static void testStatic() {

        staticY++;


    }

    public static void main(String[] args) {

     Test test = new Test(){};
     test.testNonStatic();  // не статический метод может вызываться только при помощи созданного объекта

    }


}
