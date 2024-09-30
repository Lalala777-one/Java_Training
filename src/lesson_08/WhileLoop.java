package lesson_08;

public class WhileLoop {

    /* while (условие - ПРЕДИКАТ ){
        Тело цикла - ИТЕРАЦИЯ
        код, который будет повторяться
        }
        перед каждой итерацией цикла проверяется условие, если true выполняется тело цикла
        и так далее до тех пор пока предикат = true
         */

    public static void main(String[] args) {

        // вывести на экран числа от 1 до 5

        int number = 1; // инициализация переменной

        while (number <= 5) { // предикат цикла
            System.out.println(number); // итерация : вывод числа
            number++;
        }
        System.out.println("Цикл закончен");

        int t = 100;
        while (t >= 90) {
            System.out.println(t);
            t--;
        }

        /* бесконечный цикл
        int y = 5;
        while (y < 10){
            System.out.println(y);
        }
         */


        /* ЗАДАЧА
        найти сумму чисел от 1 до 100
        1. перебрать числа от 1 до 100
        2. каждое число добавить в какую-то переменную, накапливающую сумму чисел
         */

        int in1 = 1;
        int sum = 0;

        while (in1 <= 100){
            sum += in1; // добавляю текущее значение in1 к сумме
            in1 ++;
        }
        System.out.println("Сумма чисел 0т 1 до 100: " + sum);


        int r2 = 1;
        while (r2 <= 21){
            if (r2 % 2 == 0){
                System.out.println(r2);
            } r2 = r2 + 2;
        }

        // распечатать каждый символ строки в отдельной строчка

        String str = "Hello";

        // Нам нужно перебрать все индексы От 0 до length  - 1
        // На каждой интерации берем символ по индексу. Распечатываем
        // Повторить с другим индексом

        int in = 0;
        while (in <= str.length() - 1){
            char ch = str.charAt(in);
            System.out.println(ch);
            // System.out.println(str.charAt(in)); второй вариант записи
            in ++;

        }



        }

    }



