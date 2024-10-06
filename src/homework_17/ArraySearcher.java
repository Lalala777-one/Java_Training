package homework_17;

public class ArraySearcher {


    public int lastIndexOf(int[] array, int value) {

        if (array.length == 0 || array == null) {
            return -1;
        }

        int lastIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }

}

class Test1{
    public static void main(String[] args) {
        ArraySearcher testLastIndexOf = new ArraySearcher();

        int[] array = {2, 15, 25, 76, 45, 15, 554};
        System.out.println(testLastIndexOf.lastIndexOf(array, 15));


    }
}





