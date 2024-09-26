package lesson_09;

public class MethodExample2 {
    public static void main(String[] args) {

        int temp = 5;
        System.out.println(temp);
        changeMe(temp);
        System.out.println(temp);

        String string = "Java";
        changeMe(string);

        System.out.println(string);

        int[] arr = {4, 6, 7, 3};
        changeMe(arr);
        printArray(arr);


    }


    public static void changeMe(int[] array) {
        array[0] = 100;
    }

    public static void changeMe(String str) {
        str = str + "!!!";

    }

    public static void changeMe(int x) {
        x = 100;
    }

    public static void printArray(int[] array) {
        System.out.print("[ ");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : " ]\n"));
            i++;
        }

    }
}
