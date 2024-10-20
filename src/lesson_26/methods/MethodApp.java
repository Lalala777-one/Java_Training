package lesson_26.methods;

import lists.MyArrayList;

public class MethodApp {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 5};

        Double[] doubles = {1.1, 2.2, 3.3, 4.4};

        String[] strings = {"hello", "ok"};


        System.out.println(Util.printArray(array));
        System.out.println(Util.printArray(doubles));

        Util.swap(array, 0, 1);
        System.out.println(Util.printArray(array));

        double sum = Util.sum(doubles);
        System.out.println(sum);

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.addAll(1, 2, 3, 4, 5, 6, 7, 8);

        double listSum = Util.listSum(myArrayList);
        System.out.println(listSum);

        MyArrayList<String> strings1 = new MyArrayList<>();
        strings1.addAll("Hello", "List");
       // double listSum2 = Util.listSum(strings1);   будет ошибка потому что мы ограничили метод и он работает только с классом
        // Number и его потомками

    }
}
