package homeWork_14;

public class Task1 {

    public static void main(String[] args) {

        int [] arrayInt = {2, 2, 4, 6, 13, 3, 0, 5, 19};
        System.out.println(sum(arrayInt));

    }

    public static int sum (int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
