package lesson_26.methods;

import lists.MyArrayList;
import myExperience.Arrays;

public class Util<T> {

    // Метод возвращающий строковое представление любого массива
    public static <T> String printArray(T[] array) {
        if (array == null || array.length == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append((i < array.length - 1) ? ", " : "]");

        }
        return sb.toString();
    }

    // поменять местами два елемента в любом массиве по из индексу

    public static <T> void swap(T[] array, int ind1, int ind2) {
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    // Ограничения сверху Upper Bounds
    // Метод который считает сумму элементов в массиве
    // T extends Number - тип T должен быть либо классом Number либо его наследником

    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();

        } return sum;

    }

    // Метод принимает MyArrayList только с элементами типа Number или его наследниками
    // <? extends Number> - мы работаем с неизвестным типом но который является наследником Number

    public static double listSum(MyArrayList<? extends Number> listNumber){

        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();

        } return sum;

    }
}
