package lesson12;

public class ArraysUtil {
    // Метод линейного поиска элемента в массиве
    // Осуществляется перебором всех элементов и сравниванием с искомым значением
    // если значение найдено - возвращается индекс элемента массива
    // если не найдено возвращается -1

    // Однозначно сказать что число отсутствует в массиве?
    // потребуется перебрать все элементы массива -> O (n) -> ЛИНЕЙНАЯ ЗАВИСИМОСТЬ

    public static int linearSearch(int[] array, int searchValue) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == searchValue) {
                System.out.println("Линейный поиск нашел за " + counter + " шагов");
                return i; // возвращает индекс
            }
        }
        System.out.println("Не нашел. Потрачено шагов: " + counter);
        return -1;
    }

    // метод ищет минимальное значение по всему массиву
    // и возвращает индекс min значения

    public static int minIndex(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // метод который ищет мин значение в части массива от стартового индекса и до конца массива
    // и возвращает индекс мин значения

    public static int minIndex(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }

    }

    // БИНАРНЫЙ ПОИСК значения в массиве

    public static int binarySearch(int[] array, int searchValue) {

        int startIndex = 0;
        int endIndex = array.length - 1; // 12
        int middleIndex;

        int counter = 0;
        //Проверка что часть массива можно разделить пополам

        while (startIndex <= endIndex) { // равнение 0 <= 12

            counter++;

            // вычислить средний индекс

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // Сравниваем значение в средней части массива с искомым

            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за " + counter + " шагов");
                return middleIndex;
            }

            // Если значения не равны определяем какую половину массива ми отбрасываем

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        //если цикл while закончен (е осталось частей массива, которые можно поделить пополам
        // значит возвращаем значение в массиве отсутствует)

        System.out.println("Значение не найдено! Шагов сделано: " + counter);

        return -1;
    }
}



