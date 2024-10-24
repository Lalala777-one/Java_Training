package lesson_29.iterators;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class ForEachExample {

    public static void main(String[] args) {
        MyArrayList<String > list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Python");
        list.add("Java");

        Iterator<String> iterator = list.iterator();

        // цикл for-each

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
// почему ошибки??
        // for(String s: list){
      //      System.out.println(s);
     //   }
    }

    /*
    for (ТипПеременнной переменная : коллекция )
    //действия с переменнной
     */


}
