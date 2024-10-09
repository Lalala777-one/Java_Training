package homework_19;

import homework_18.Dog;

import java.util.Arrays;
import java.util.Random;

public class DodTest {

    public static void main(String[] args) {



        Random random = new Random();


        Dog dog1 = new Dog("Rex", random.nextInt(51) + 30);

        Dog dog2 = new Dog("Pex", random.nextInt(51) + 30);
        Dog dog3 = new Dog("Tort", random.nextInt(51) + 30);
        Dog dog4 = new Dog("Archi", random.nextInt(51) + 30);
        Dog dog5 = new Dog("Rom", random.nextInt(51) + 30);


        Dog[] allDogsArray = {dog1, dog2, dog3, dog4, dog5};




        // Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.

        Random random2 = new Random();


        int[] barriers = new int[7];
        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random2.nextInt(101) + 70;
        }




        // Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.


        for (int i = 0; i < allDogsArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < barriers.length; j++) {
                if (allDogsArray[i].jumpBarrier(j)) {
                    counter++;
                }
            }
            System.out.println(allDogsArray[i] + "смогла перепрыгнуть " + counter + " барьеров.");
        }
        // - Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке


    }
}

