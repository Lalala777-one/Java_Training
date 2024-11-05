package homeWork_38.task1.task2;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        // Проверка на четность
        boolean isO1Even = (o1 % 2 == 0);
        boolean isO2Even = (o2 % 2 == 0);

        // ( o1 должен идти раньше)
        if (isO1Even && !isO2Even) {
            return -1;
        }
        // (o1 должен идти позже)
        if (!isO1Even && isO2Even) {
            return 1;
        }
        // Если оба четные или оба нечетные, сортируем по значению
        return Integer.compare(o1, o2);

    }

    // Task3
    /*
    Task 3 * ОПЦИОНАЛЬНО
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
// Сортировка массива с использованием компаратора
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
     */

    Comparator<Integer> comparator = (int1, int2) -> {
        // Проверка на четность
        boolean isO1Even = (int1 % 2 == 0);
        boolean isO2Even = (int2 % 2 == 0);

        // если оба четные - прямая сортировка в порядке возрастания

        if (isO1Even && isO2Even) {
            return Integer.compare(int1, int2);
        } else if (isO1Even) { // только первое четное, второе не четное. Четное должно быть меньше
            return -1;
        } else if (isO2Even) { // первое не четное, аторое четное. первое должно быть "больше"
            return 1;
        } else { // оба НЕ четные. Сортировать в порядке убывания
            return Integer.compare(int2, int1);

        }
    };
}








