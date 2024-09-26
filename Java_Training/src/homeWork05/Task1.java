package homeWork05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name is " + name);

        System.out.println("Number of characters: " + name.length());

        char firstCharacter = name.charAt(0);
        char lastCharacter = name.charAt(name.length() - 1);
        System.out.println("The first character is " + firstCharacter + "." + "The last character is " + lastCharacter);

        int firstCh = (int)firstCharacter;
        int lastCh = (int)lastCharacter;
        System.out.println("firstCh " + firstCh);
        System.out.println("lastCh " + lastCh);
    }
}
