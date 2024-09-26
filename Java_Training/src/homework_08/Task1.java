package homework_08;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int i = 1;
        int product = 1;

        while (i <= 15) {
            product *= i;
            i++;
        }
        System.out.println("Product: " + product);

    }
}


class Task2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i );
            i++;
        }
    }
}


class Task3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}


class Task3_1 {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;
        while (count < 7) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
                count++;
            }
            i++;
        }
    }
}


class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word \"hello\":");
        String input = scanner.nextLine();
        int attempts = 0;

        String correctAnswer = "hello";

        if (input.equals(correctAnswer)) {
            System.out.println("Thank you");
            System.exit(0);
        }

        while (!input.equals(correctAnswer)) {
            System.out.println("Try it again");
            input = scanner.nextLine();
            attempts ++;

        }
        System.out.println("Thank you");
        System.out.println("Количество попыток: " + attempts);
    }
}






