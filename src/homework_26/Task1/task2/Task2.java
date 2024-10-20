package homework_26.Task1.task2;

import lists.MyArrayList;

public class Task2  {


    public static <T, U> void printTwoLists(MyArrayList<T> list1, MyArrayList<U> list2){
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));

        }

    }

}
