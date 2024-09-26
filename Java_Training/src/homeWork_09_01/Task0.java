package homeWork_09_01;

public class Task0 {
    public static void main(String[] args) {

        schowNumber("Hello!");


        int[] array1 = {2, 4, 7, -13, 25, 16};

        //  show(array1);
        printArrayReverse(array1);
        System.out.println();
        printArrayReverse(array1, 3);
        System.out.println();
        printArrayReverse(array1, true);


    }

    // Task0
    public static void schowNumber(String str) {
        System.out.println(str.length());
    }

    // Task1

    public static void printArrayReverse(int[] arr) {

        int i = arr.length - 1;

        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;

        }
    }

    // перезагрузка метода с индексом

    public static void printArrayReverse(int[] arr1, int index) {
        if (index < 0 || index >= arr1.length) {
            System.out.println("Index out of bounds");
            return;
        }
        int i = 0;
        while (i < index) {
            System.out.print(arr1[i++] + " ");

        }
        i = arr1.length - 1;
        while (i >= index) {
            System.out.print(arr1[i--] + " ");

        }
    }

    // перезагрузка + булиевый фгал

    public static void printArrayReverse(int[] arr2, boolean bool) {

        int i = 0;
        if (bool) {
            while (i < arr2.length) {
                System.out.print(arr2[i++] + " ");
            }
        } else {
            i = arr2.length - 1;
            while (i >= 0) {
                System.out.print(arr2[i--] + " ");
            }
        }
    }
}





   /* public static void printArrayRevers(int[] arr){

        int i = 0;
        System.out.print("[ ");
        while (i < arr.length){
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : " ]\n"));
            i++;
        }
    }
}
*/

