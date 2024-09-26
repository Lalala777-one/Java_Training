package lesson_09;

public class MethodsExample {
    public static void main(String[] args) {
        sayHello();
        sayHello();

        String string = "Java";
        saySomething(string);

        char ch = 'A';
        printDecimalCodeChar(ch);
        printDecimalCodeChar('H');

        int array[] = {2, 5, 10, 45, 68, 0, 345, 9482};
        int array1[] = {5, 45, 1, 78, 68, 0, 3454, 129482};


        printArray(array);
        printArray(array1);
        array1[0] = -1;
        array1[4] = 78;

        printArray(array1);

        System.out.println("========== Перезагрузка методов ");

        // ПЕРЕГРУЗКА МЕТОДОВ
        /*
        В пределах одного класса может существ два и более методов с одним именем,
        но разным набором параметров (перегрузка методов)

       !!!  СИГНАТУРА МЕТОДА - совокупность назнания метода и набора параметров (порядок передачи параметров имеет значение)
         */

        // НАПИСАТЬ МЕТОД КОТ ВЫВОДИТ НА ЭКРАН ИСЛА ОТ 1 ДО N

        printNumbers(10);
        printNumbers(4, 8);

        printNumbers(5, "Java");
        printNumbers("Python", 2);

        // Написать метод кот будет выводить на экран числа от Х до У

    }  // Method  выводич числа от 1 до n

    public static void printNumbers(int x, int y){
        int i = x;
        while (i <= y){
            System.out.print(i++ + ", ");
        }

        System.out.println();

    }

    public static void printNumbers(int n){
        int i = 1;
        while (i <= n){
            System.out.print(i++ + ", ");
        }
        System.out.println();
    }

    public static void printArray(int[] array){
        System.out.print("[ ");
        int i = 0;
        while (i < array.length){
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : " ]\n" ));
            i++;
        }

    }



    public static void printDecimalCodeChar(char ch1){
        System.out.println((int) ch1);
    }

    public static void saySomething (String text){
        System.out.println(text);

    } // Method

    public static void sayHello (){
        // тело метода
        System.out.println("Hello!");

    }

    public static void printNumbers(int i, String str){
        System.out.println("Method opt 1: " + str);
    }

    public static void printNumbers(String str, int i){
        System.out.println("Method opt 2: " + str);
    }
}
