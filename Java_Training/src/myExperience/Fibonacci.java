package myExperience;

public class Fibonacci {

    public static void main(String[] args) {

        showFibonacciSequence(7);
    }

    public static int[] showFibonacciSequence(int n) {

        if (n <= 0)
            return new int[0];

        int[] array = new int[n];

        if (n >= 1) array[0] = 0;
        if (n >= 2) array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}



