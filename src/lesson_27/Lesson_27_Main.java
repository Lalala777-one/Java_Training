package lesson_27;

import lists.MyArrayList;

import java.util.Arrays;

public class Lesson_27_Main {
    public static void main(String[] args) {

        MyArrayList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 4, 7, 15, 78);

        System.out.println(integers);

        integers.add(1);
        System.out.println(integers);

        System.out.println("size: " + integers.size());

        System.out.println("integers.indexOf(3) " + integers.indexOf(3));
        System.out.println("integers.isEmpty() " + integers.isEmpty());

        int index = integers.indexOf(7);
        System.out.println("index " + index);

        integers.set(2, 15);
        System.out.println(integers);

        System.out.println("integers.contains(15) " + integers.contains(15));
        System.out.println("integers.contains(100) " + integers.contains(100));

        Integer value = integers.get(50);
        System.out.println(value);
        value = integers.get(2);
        System.out.println("===============");
        System.out.println(value);

        System.out.println("================================\n");
        System.out.println(integers.remove(2));
        System.out.println(integers);
        System.out.println(integers.remove(Integer.valueOf(78))); // чтобы удалить по значению требуется указать явное приведение
        System.out.println(integers);

        System.out.println("===========================================\n");

        Integer[] array = integers.toArray();
        System.out.println(Arrays.toString(array));

    }
}
