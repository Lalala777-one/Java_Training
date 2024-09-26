package homework10_02;

public class ReturnExample {
    public static void main(String[] args) {


        sum(5.0, 2.0);

    }

    public static int sum(int a, int b){
        if(a > b){
            return a + b;

        }else {
            return a - b;
        }
    }

    public static void sum (double a, double b){
        if(a > b){
            System.out.println("Error! a > b - с такими значениями метод работать отказывается");
            return;
        }
        System.out.println("Метод sum double продолжает работу: " + a + b); // не будет сумировать, будет конкатинация
    }
}
