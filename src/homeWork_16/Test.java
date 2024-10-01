package homeWork_16;

import lesson_16.MagicArray;

public class Test {

    public static void main(String[] args) {
        MagicArrayHw magicArrayHw = new MagicArrayHw();

        magicArrayHw.add(100, 200, 300, 400, 500, 600);
        System.out.println(magicArrayHw.toString());

        magicArrayHw.removeByValue(200);
        System.out.println(magicArrayHw.toString());

        int[] array = {1, 2, 3, 4};
        MagicArrayHw magicArrayHw1 = new MagicArrayHw(array);
        System.out.println(magicArrayHw1.toString());

        magicArrayHw1.add(5, 6, 7, 8, 9, 10);
        System.out.println(magicArrayHw1.toString());



    }
}
