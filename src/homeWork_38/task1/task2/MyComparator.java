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
}




