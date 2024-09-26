package homework_10_1;

public class Task3 {
    public static void main(String[] args) {

        int[] arrayInt = {1, 10, 17, 25, 67, 4, 11, 24};
        int[] newPrimeArray = returnNewArray(arrayInt);

        for (int i = 0; i < newPrimeArray.length; i++) {
            System.out.print(newPrimeArray[i] + " ");
        }

    }

    // Method

    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) {
                return false;
            }

        return true;
    }

    //Method

    public static int[] returnNewArray(int[] arrayInt) {

        int count = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (isPrime(arrayInt[i])) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (isPrime(arrayInt[i])) {
                newArray[index++] = arrayInt[i];
            }

        }
        return newArray;

    }
}

