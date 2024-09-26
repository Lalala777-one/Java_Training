package lesson_09;

import java.lang.ref.SoftReference;

public class TernarOperator {
    public static void main(String[] args) {

        int i = - 15;

        String result;
        if (i > 0){
            result = "положительное";
        }else {
            result = "отрицательное";
        }

        // тернарный оператор

        String res1 = (i >= 0) ? "положительное" : "отрицательное";
        System.out.println("Число " + result);
    }
}
