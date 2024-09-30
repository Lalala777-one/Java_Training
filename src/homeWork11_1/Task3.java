package homeWork11_1;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {2, 4, 0, 4, 3, 2};
        int[] array2 = {3, 4, 4, 3};

        System.out.println("This array is a palindrome: " + isPalindrome(array));


        System.out.println("isPalindromeIsPalindrome");

        System.out.println("This array is a palindrome: " + isPalindrome2(array) );
    }

    // Method Task3

    public static boolean isPalindrome(int[] arrayInt) {
        if (arrayInt == null || arrayInt.length == 0) {
            return false;
        }

        boolean isSymmetric = true;

        for (int i = 0, k = arrayInt.length - 1; i < arrayInt.length && k >= 0; i++, k--) {
            if (arrayInt[i] != arrayInt[k]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }


// какой код будет работать оптимизирование? что отработает быстрее? с делением на 2 или без

    // Method Task3

    public static boolean isPalindrome2(int[] arrayInt) {

        if (arrayInt == null || arrayInt.length == 0) {
            return false;
        }

        boolean isSymmetric = true;

        double arrayLength = (double)arrayInt.length / 2;

        for (int i = 0, k = arrayInt.length - 1; i < arrayLength && k > arrayLength; i++, k--) {
            if (arrayInt[i] != arrayInt[k]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
