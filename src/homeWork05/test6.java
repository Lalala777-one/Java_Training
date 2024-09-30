package homeWork05;

public class test6 {
    public static void main(String[] args) {
        String string = "Python is the best language";

        String string1 = string.replace("Python", "Java");
        System.out.println(string1);
        String string2 = string.replaceFirst("Python", "Java");
        System.out.println(string2);

    }
}
