package homeWork05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        System.out.println("Введите строку чётной длины: ");

        if (str1.length() % 2 == 0 ){
            int  index = str1.length() / 2;
            char index1 = str1.charAt(index - 1);
            char index2 = str1.charAt(index);

            System.out.print("result " + index1 + index2);
        }
        else {
            System.out.println("Ты проиграл!");

        }

    }
}
