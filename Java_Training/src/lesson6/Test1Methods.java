package lesson6;

public class Test1Methods {
    public static void main(String[] args) {

        String replaceMe = "AbAbAbAc";

        int indexAb1 = replaceMe.indexOf("Ab");
        System.out.println("indexAb1 " + indexAb1);

        int indexAb2 = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2 " + indexAb2);
    }
}
