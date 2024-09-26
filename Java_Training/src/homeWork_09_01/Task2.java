package homeWork_09_01;

public class Task2 {
    public static void main(String[] args) {
        raiseToPower(5);

    }

    // Method

    public static void raiseToPower(int n) {

        int result = 1;
        int in = 0;

        if (n > 0) {
            while (in < n) {
                result *= 2;
                in++;
            }
            System.out.println("2 в степени " + n + ": " + result);
        }

        if (n == 0) {
            System.out.println("2 в степени " + n + ": " + result);
            return;
        }

        if (n < 0) {
            double frakt = 1.0;
            int i = 0;
            while (i < -n) {
                frakt *= 0.5;
                i++;
            }
            System.out.println("2 в степени " + n + ": " + frakt);

        }

    }
}
