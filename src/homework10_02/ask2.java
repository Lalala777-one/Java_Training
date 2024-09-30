package homework10_02;

import java.util.Arrays;

public class ask2 {
    public static void main(String[] args) {

        String[] arrayStiengs = {"One", "Java", "Python", "Js", "Hello"};
        String[] result = gerArrayWihtSmallestString(arrayStiengs);
        System.out.println(Arrays.toString(result));

        System.out.println(" ================== testArray = null ===============");

        arrayStiengs = new String[0];

        System.out.println(" ================== null is array ===============");

        arrayStiengs = new String[]  {"One", "Java", null, "Js", "Hello"};
       // arrayStiengs = null;

        System.out.println(" ================== null is array ===============");
        arrayStiengs = new String[]  {null, "Java", null, "Js", "Hello"};

        String[] result2 = gerArrayWihtSmallestString(arrayStiengs);



        // if(result2.length == 0){  // проверка что пришло в метод НЕ ОБЯЗАТЕЛЬНАЯ
        //    System.out.println("Метод не нашел строки ");
        //   }
        System.out.println(Arrays.toString(result2)); // NullPointerException НЕ РАБОТАЕТ

    }



    public static String[] gerArrayWihtSmallestString(String[] strings) {

        // метод не должен зависеть от того, что в него придет, по этому в самом массаве делаются
        // различные проверки

        if (strings == null || strings.length == 0) {
            return new String[0];
        }

        String notNulValue = findFirsrNotNul(strings);
        System.out.println("notNulValue" + notNulValue);

        if(notNulValue == null){
            return new String [0];
        }


        String smallest = notNulValue;  // начинаем не с нулевого индекса, а с первого индекса который != null
        String biggest = notNulValue;

        for (int i = 1; i < strings.length; i++) {

            if (strings[i] != null && strings[i].length() < smallest.length()) { // чтобы обезопасить себя когда элемент массива = null)
                smallest = strings[i];
            }
            if (strings[i] != null && strings[i].length() > biggest.length()) {
                biggest = strings[i];
            }
        }
        return new String[]{smallest, biggest};
    }


    public static String findFirsrNotNul(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            if(strings[i] != null){
                return strings[i];
            }

        }
        // Если мы перебрали все элементы массива и не нашли не null значение, возращаем null
        return null;
    }
}
