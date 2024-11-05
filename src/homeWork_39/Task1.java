package homeWork_39;

import java.util.*;

public class Task1 {

    /*
    Напишите метод, который принимает на вход две реализации интерфейса List.

Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
     */

    public static void main(String[] args) {
      List<String> fruts1 = new ArrayList<>(List.of("Banana", "Cherry", "Apple", "Orange"));
      List<String> fruts2 = new ArrayList<>(List.of("Peach", "Cherry", " Pear", "Pineapple", "Apple", "Banana"));


        List<String> resultVar1 = newListVar1(fruts1, fruts2);
        System.out.println(resultVar1);

        System.out.println("=============================================");

        List<String> resultVar3 = newListVar3(fruts1, fruts2);
        System.out.println(resultVar3);

        System.out.println("fruts1 " + fruts1);

        System.out.println("=============================================");

        List<String> resultVar2 = newListVar2(fruts1, fruts2);
        System.out.println(resultVar2);



    }

    public static List<String> newListVar1 (List<String> strings1, List<String> strings2){
        List<String> newList = new ArrayList<>();
      for (String string : strings1){
          if(strings2.contains(string)){
             newList.add(string);
          }
      }return newList;
    }



    public static List<String> newListVar2 (List<String> strings1, List<String> strings2){
        strings1.retainAll(strings2);
        return strings1;  // проблема, меняется изначальный List strings1
    }



    public static List<String> newListVar3 (List<String> strings1, List<String> strings2){
        List<String> strings1Copy = new ArrayList<>(strings1);

        strings1Copy.retainAll(strings2);
        return strings1Copy;
    }

}
