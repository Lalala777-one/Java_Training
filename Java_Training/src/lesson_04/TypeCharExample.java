package lesson_04;

public class TypeCharExample {
    public static void main(String[] args) {

        char a = 'A';

        System.out.println("a: " + a);

        char a1 = 65;
        System.out.println("a1: " + a1);

        char a2 = 0x41;
        System.out.println("a2: " + a2);

        a2 = 0x0041;

        System.out.println(a2);

        char a3 = '\u0041';
        System.out.println("a3: " + a3);

        char x = '\u1507';
        System.out.println("x: " + x);



        char digit0 = 48;
        System.out.println("digit0 : " + digit0);

       // digit0 = (char) (digit0 + 5); System.out.println(digit0);

        int var = 5;
        var += 5;
        var -= 2;
        var *= 2;
        var /= 4;

        // инкремент, декремент

        var ++; // var += 1; var = var + 1;
        var --; // var -= 1; var = var - 1;

        System.out.println("============");
        // постинкремент, прединкримент
        int c = 100;
        System.out.println("c1: " + c++);
        System.out.println("c2: " + c);

        int t = 100;
        System.out.println("t1: " + ++t);
        System.out.println("t2: " + t);





        digit0 += 5;
        System.out.println(digit0);

        char letter = 97;
        letter ++;
        System.out.println(letter);

        System.out.println("int из char даст 10-1 код символа " + (int) letter);

        System.out.println(0 + letter);




    }
}
