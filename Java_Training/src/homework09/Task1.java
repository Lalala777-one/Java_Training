package homework09;

// проверить

public class Task1 {
    public static void main(String[] args) {

        int[] array = {1,3,5,7,15};
        printReverseArrayWhile(array, 3);
        printReverseArrayWhile(array);
        printReverseArrayWhile(array, false);

    }

    public static void printReverseArrayWhile (int[] arr, int index){
        System.out.print("[ ");
        int i = 0;
        while (i < index){
            i++;
            System.out.print(arr[i] + (i != index ? ", " : " ]\n"));
        }
        System.out.print("[ ");
        i = arr.length - 1;
        while (i >= index){
            System.out.print(arr[i] + (i != index ? ", " : " ]\n"));
            i--;
        }
        System.out.println();

    }
    public static void printReverseArrayWhile(int[] arr){
        printReverseArrayFor(arr, 0);
    }


    public static void printReverseArrayWhile (int[] arr, boolean flag){
        if (flag){
            // flag = true
            printReverseArrayWhile(arr);
        }else {
            printReverseArrayWhile(arr, arr.length - 1);
        }

    }


    public static void printReverseArrayFor (int[] arr, int index){
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= index ; i--) {
            System.out.print(arr[i] + " ");

        }
    }

}
