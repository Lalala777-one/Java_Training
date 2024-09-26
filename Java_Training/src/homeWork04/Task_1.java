package homeWork04;

public class Task_1 {
    public static void main(String[] args) {

        int i = 10;
        double myDouble = i;

        System.out.println("My double is " + myDouble);
    }
}

class Task_2{

    public static void main(String[] args) {

        double myDouble = 5.99;
        int myInt = (int)myDouble;
        System.out.println("My int is " + myInt);
    }
}


class Task_3{
    public static void main(String[] args) {

        long bigNumber = 15_000_000_000L;
        int smallNumber = (int)bigNumber;
        System.out.println("Small number is " + smallNumber);
        // int вмещает в себя гораздо меньшие значения, по этому при преобразованиее результат был сокращен до 10-значного числа, который помещается в int

    }
}


class Test_4{
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'a';
        char ch4 = 's';
        char ch5 = 't';
        char ch6 = 'a';
        char ch7 = 's';
        char ch8 = 'i';
        char ch9 = 'i';
        char ch10 = 'a';

        ch1 -= 32;
        ch2 -= 32;
        ch3 -= 32;
        ch4 -= 32;
        ch5 -= 32;
        ch6 -= 32;
        ch7 -= 32;
        ch8 -= 32;
        ch9 -= 32;
        ch10 -= 32;

        System.out.println("MY NAME IS " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7 + ch8 + ch9 + ch10);

    }
}


class Test_4Analog {

    public static char changeLetter (char letter){
        return (char)(letter - 32);
    }

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'a';
        char ch4 = 's';
        char ch5 = 't';
        char ch6 = 'a';
        char ch7 = 's';
        char ch8 = 'i';
        char ch9 = 'i';
        char ch10 = 'a';

        ch1 = changeLetter(ch1);
        ch2 = changeLetter(ch2);
        ch3 = changeLetter(ch3);
        ch4 = changeLetter(ch4);
        ch5 = changeLetter(ch5);
        ch6 = changeLetter(ch6);
        ch7 = changeLetter(ch7);
        ch8 = changeLetter(ch8);
        ch9 = changeLetter(ch9);
        ch10 = changeLetter(ch10);

        System.out.println("MY NAME IS " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7 + ch8 + ch9 + ch10);

    }


}
