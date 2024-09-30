package homework_10_1;

import java.awt.*;

public class Task2 {
    public static void main(String[] args) {

        String[] input = {"Hello", "Bye", "Task", "Apple", "Car"};
        String[] resultString = returnStringWithMinMaxLength(input);
        System.out.print("[");
        for (int i = 0; i < resultString.length; i++) {
            System.out.print(resultString[i] + (i < resultString.length - 1 ? ", " : "]\n"));
        }
    }

    public static String[] returnStringWithMinMaxLength(String[] arrayString) {

        String shortestString = arrayString[0];
        String longestString = arrayString[0];
        for (int i = 1; i < arrayString.length; i++) {
            if (arrayString[i].length() < shortestString.length()) {
                shortestString = arrayString[i];
            }
            if (arrayString[i].length() > longestString.length()) {
                longestString = arrayString[i];

            }

        }
        return new String[]{shortestString, longestString};

    }
}
