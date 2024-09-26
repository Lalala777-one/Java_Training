package homeWork11_1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 11};
        System.out.println(average(array));

        System.out.println("===============================");

        int[] array2 = {};
        average(array2);

    }

    // Method Task2

    public static double average (int[] arrInt){
        if (arrInt == null || arrInt.length == 0 ) {
            System.out.println(Integer.MIN_VALUE);
            return Integer.MIN_VALUE;
        }

        int sum = 0;
        for (int i = 0; i < arrInt.length; i++) {
            sum += arrInt[i];
        }
        return (double) sum / arrInt.length ;
    }
}
