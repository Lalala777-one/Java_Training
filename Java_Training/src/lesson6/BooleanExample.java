package lesson6;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {
        System.out.println("Логические операции");

        boolean b2;

        // !

        b2 = !false;
        System.out.println("b2 " + b2);

        b2 = !(4 == 5);
        System.out.println("!(4 == 5)  " + b2);


        // составные сравнения = два условия

        // Логические И _ использ когда нужно чтобы оба условия были истинными
        // Рим столица Италии И Берлин столица Голландии
        //Если хотя бы в одной части будет false, то все выражение будет false

        b2 = true & true;
        System.out.println("true & true " + b2);

        b2 = (2 < 5) & (11 == 10); // true & false -> false
        System.out.println("(2 < 5) & (11 == 10) " + b2);


        // Логическое ИЛИ
        //Достаточно чтобы хотя бы одно условие true

        boolean b4 = true |  false;
        System.out.println("true |  false -> " + b4);
        System.out.println("false |  false -> " + (false | false));



        // Генерация случайного числа в диапазоне от 0 до X


        Random random = new Random();
        int rand = random.nextInt(100);  // (0... х - 1) -> ( 0... 99) включительно
        System.out.println(rand);
        boolean isEven = rand % 2 == 0;
        boolean iGoodNumber = (rand % 2 == 0) | (rand % 5 == 0);
        System.out.println("isEven " + isEven);
        System.out.println("iGoodNumber " + iGoodNumber);


        // Логическое исключающее ИЛИ -> ^
        // возвращает true если две части выражение РАЗНЫЕ

        boolean b5 = true ^ false;
        System.out.println("true ^ false -> " + b5);
         b5 = false ^ true;
         b5 = false ^ false;
         b5 = true ^true;


        System.out.println("================================================");



        // Логическое сокращенное И -> &&
        // Только если обе части выражение равны true выдает true

        boolean b6 = true && false;
        System.out.println("true && false -> " + b6);

        b6 = (2 > 5) && (11 == 11);
        System.out.println(b6);

        int a = 10;
        int b = 0;

        // правая часть не выполняется так как в левой части у нас false и значение
        // переменной b7 не зависит от правой части выажения

        boolean b7 = (b != 0) &&  (a / b > 2);
        System.out.println("a / b > 2 -> " + b7);

        // Логическое сокращенное ИЛИ ||
        // выдает true если хотя бы одна часть выражения = true .
        // если левая часть выражение true правая уже не будет проверяться

        boolean b8 = true || (a / b > 2);  // если использовать | будет выдавать ошибку из за правой части выражения
        System.out.println(b8);


        System.out.println("Приоритет логических операций");






    }
}
