package lesson_18.StaticBlockDemo;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {



        System.out.println("counter = " + InitExample.counter);
        System.out.println(Arrays.toString(InitExample.colors));

        System.out.println("\n=============================\n");

        InitExample initObgect = new InitExample();

        System.out.println("\n=============================\n");

        System.out.println(initObgect.toString());

        System.out.println("\n=============================\n");

        InitExample initObject2 = new InitExample();

    }
}
