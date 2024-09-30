package homeWork_11_02;
// проверка Палиндром

public class Task3 {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 9, 8, 6};
        System.out.println(isPalindrom(array));

    }

        public static boolean isPalindrom(int[] array){
            if(array == null || array.length == 0){
                return false;
            }

            int n = array.length;
            for (int i = 0; i < n/2; i++) {
                if(array[i] != array[n - 1 - i]){
                    return false;
                }
            }
            return true;
        }
    }

