package homework09;
// Task2 из Homework 9

public class Task2 {
    public static void main(String[] args) {
        porTwo(-5);

    }

    public static void powTwo2(int pow){  // в этом варианте метода код повторяется
        if(pow >= 0){
            int result = 1;
            for (int i = 0; i < pow; i++){
                i *= result;
            }
            System.out.printf("2 ^ %d = %d\n", pow, result);
        }else {
            // здесь пришла отрицательная степень
            // 2 ^ -2 = 1 / (2 ^ 2)
            pow = pow * -1;
            int result = 1;
            for (int i = 0; i < pow; i++){
                result = result * 2;
            }
            double doubleResult = 1 / (double)result;
            System.out.printf("2 ^ %d = 1 / %d = %.4f\n", pow, result, doubleResult);
        }
    }



    public static void porTwo(int pow){

        // 2 в степ -2 = 1 / (2 в степ 2) = 1 / 4 = 0.25

        boolean isPositiv = pow >= 0;

      pow = (isPositiv) ? pow : pow * -1;  //если pow  + то pow остаесть прежним

        int result = 1;

        for (int i = 0; i <pow ; i++) {
            result = result * 2;
        }

        if(isPositiv){
            System.out.printf("2 ^ %d = %d\n", pow, result);
        }else {
            System.out.printf("2 ^ %d = %.4f\n", pow, 1 / (double)result); // что значит это %.4f
        }

    }
}

