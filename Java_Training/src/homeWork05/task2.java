package homeWork05;

public class task2 {
    public static void main(String[] args) {
        String st1 = "java";
        String st2 = "is";
        String st3 = "a";
        String st4 = "powerful";
        String st5 = "language";

        String concat1 = st1 + " " + st2 + " " + st3 + " " + st4 + " " + st5;
        System.out.println(concat1);

        String concat2 = String.join(" ", st1, st2, st3, st4, st5);
        System.out.println("concat2 " + concat2);
        System.out.println("Concat lenght: " + concat2.length());

        // tast 2.2

        String changeSt4 = concat2.replace(st4, "super");
        System.out.println("changeSt4 " + changeSt4);

        String concat3 = String.join(" ", st1, st2, st3, "super", st5);
        System.out.println("concat3" + concat3);

        boolean bool = concat3.contains("age");
        System.out.println(bool);

    }
}
