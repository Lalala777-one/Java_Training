package homework07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3 ");
        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("One");
        } else if (input == 2) {
            System.out.println("Two");
        } else if (input == 3) {
            System.out.println("Three");
        } else {
            System.out.println("Incorrect number");
        }
    }
        }



