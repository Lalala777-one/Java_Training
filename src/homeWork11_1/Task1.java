package homeWork11_1;

public class Task1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 10};
        int[] arr2 = {};

        int sum = sumArrayNumbers(arr);
        System.out.println("Sum: " + sum);

        System.out.println("=================================");

        sumArrayNumbers(arr2);

    }


    // Method Task1

    public static int sumArrayNumbers (int[] arrayInt){
        if (arrayInt == null || arrayInt.length == 0 ) {
            System.out.println(Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }


        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            sum += arrayInt[i];
        }
        return sum;
    }
}
