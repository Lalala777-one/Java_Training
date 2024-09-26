package homework08_02;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String input = scanner.nextLine();
        System.out.println("Введено число: " + input);

        if (input.length() != 4){
            System.out.println("Введено некорректное число!");
        }else {
           // System.out.println((int)input.charAt(0));
           // int code1 = input.charAt(0) - 48;
          //  System.out.println("code1 = " + code1);


        if (input.charAt(0)  + input.charAt(1)  == input.charAt(2) + input.charAt(3)){
            System.out.println("Число счастливое");
        }else {
            System.out.println("Повезет в следующий раз");
        }
        }


        // третий способ


        System.out.println("Второй способ");  // чтобы получить с первого числа по последнне нужно разделить на 1000, потом на 100, потом на 10
        // Второй способ
        if (input.length() == 4){
            // код обработки строки
            int input1 = Integer.parseInt(input);
            System.out.println("input: " + input);

            // 1234

            int digit0 = input1 % 10;  //получим последнюю цифру
            input1 = input1 / 10; // остаток 3 первых цифр

            // 123
            int digit1 = input1 % 10;
            input1 = input1 / 10;

            // 12
            int digit2 = input1 % 10;
            int digit3 = input1 / 10;

            System.out.printf("Числа %d, %d, %d, %d \n", digit0, digit1, digit2, digit3);

            if (digit0 + digit1 == digit2 + digit3){
                System.out.println("Число счастливое");
            }else {
                System.out.println("Повезет в следующий раз");
            }
        }else {
            System.out.println("Длина строки не 4 символа");
        }

    }
}
