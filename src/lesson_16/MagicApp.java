package lesson_16;

public class MagicApp {
    public static void main(String[] args) {

        MagicArray magicArray = new MagicArray();

     /*   magicArray.cursor = 100_000;
        magicArray.array = new int[1000];
        magicArray.array = new int[] {1, 2, 3 };
        magicArray.add(100);

        проблема из-за того что методы, курсор и тд public
      */

        int[] test = {1, 2, 3, 4, 5, 6};

        magicArray.add(1, 3, 4, 5, 6, 7, 8, 8, 9, 10);
        magicArray.removeMe(2);

        boolean isDeleted = magicArray.removeByValue(7);
        System.out.println("Is deleted " + isDeleted);
        System.out.println(magicArray.toString());
    }
}
