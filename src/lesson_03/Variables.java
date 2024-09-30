package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable;

        myFirstVariable = 1;

        int mySecondVariable = 25;


        System.out.println(myFirstVariable);
        System.out.println(mySecondVariable);

        mySecondVariable = 50;
        System.out.println(mySecondVariable);

        System.out.println("Variable is: " + mySecondVariable);

        byte byteVariable = 125;
        byteVariable = 45;

        System.out.println("Byte variable = " + byteVariable);

        short schortVar;
        schortVar = 31000;
        System.out.println("Schort variable = " + schortVar);

        long longVar = 2_100_000_0000L;
        System.out.println("Long variable is " + longVar);


    }
}
