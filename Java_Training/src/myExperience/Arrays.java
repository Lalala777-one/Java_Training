package myExperience;

public class Arrays {
    public static void main(String[] args) {

        var ints = new int[]{34, 12, 94, 65};

        for (int i = 0; i < ints.length; i++){
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        for (int i = ints.length - 1; i >= 0; i--){
            System.out.print(ints[i] + " ");
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = ints[i] * 2;
        }
        System.out.println();

        System.out.print(java.util.Arrays.toString(ints) + " ");
    }
}
