package homework07;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String input = scanner.nextLine();

        if (!(input.length() == 4))
        {
            System.out.println("Введено некорректное значение!!");
            return;
        }

        System.out.println("Введено число: " + input);

        int firstsum = Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1));
        int lastsum = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(3));

        if (firstsum == lastsum) {
            System.out.println("Это счастливый билет");
        }else{
            System.out.println("Это обычный билет");}

    }
}
