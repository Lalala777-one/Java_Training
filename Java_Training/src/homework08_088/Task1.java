package homework08_088;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        long mult = 1;
        int i = 1;

        while (i <= 15){
            mult *= i;   // mult *= i++; можно записать и так
            i++;
            System.out.println(mult);
        }
    }
}


class Task2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println("Task" + i++);

        }
    }
}

class Task3{
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Числа которые делятся на 5: ");
        while (i <= 100){
            if (i % 5 == 0){
                System.out.print( i + " ");
                i += 5;  // добавлять сразу + 5_ чтобы уменьшить количесво цифр которые перебираются в цикл
            } else {
                i++;
            }
        }
    }
}


class Task6{

    public static void main(String[] args) {
        Random random = new Random();
        int len = 5 + random.nextInt(11); // 5...15 - чтобы получить числа от 5 до 15

        int[] array = new int[len];

        int arrayLenght = array.length; // получить длину массива (колич элем массива)

        int i = 0;
        System.out.print("[ ");
        while (i < array.length){
            array[i] = random.nextInt(101) - 50; // число от - 50 до 50
            System.out.print(array[i] + ((i != array.length - 1) ? ", " : " ]\n"));
            i++;
            }

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;

        while (i < array.length){
            sum += array[i];

            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];

            i++;

        }

        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("Average: " + sum / (double)arrayLenght);
        }
    }

    //  ПРОВЕРИТЬ ЧТО ЗДЕСЬ НЕ ТАК

    class Task7{
        public static void main(String[] args) {
            int[] array = {5, 6, 31, 0, -25, -15};

            int minIndex = 0;
            int min = array[minIndex];

            int maxIndex = 0;
            int max = array[maxIndex];

            int i = 0;
            while (i < array.length){
                if (array[i] < min){
                    min = array[i];
                    minIndex = i;
                }

                if (array[i] > max){
                    max = array[i];
                    maxIndex = i;
                }
                i++;
            }

            System.out.println("min " +min + "minIndex " + minIndex);
            System.out.println("max " + max + "minIndex " + maxIndex);;

            array[maxIndex] = max;
            array[minIndex] = min;

            // ПОМЕНЯТЬ МЕСТАМИ ЗНАЧЕНИЯ ЯЧЕЕК

            int temp = array[maxIndex];
            array[maxIndex] = array[minIndex];
            array[minIndex] = temp;

            i = 0;
            while (i < array.length){
                System.out.println(i + " ");
            }

        }
    }



