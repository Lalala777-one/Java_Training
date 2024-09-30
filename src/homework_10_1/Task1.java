package homework_10_1;

public class Task1 {
    public static void main(String[] args) {
        int[] ints = {4, 5, 10, 15, 34};
        createNewArray(ints, 6);


    }

    public static void createNewArray(int[] ints, int newLength) {

        int[] newArray = new int[newLength];

        for (int i = 0; i < ints.length && i < newLength; i++) {
            newArray[i] = ints[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");

        }

    }

}

