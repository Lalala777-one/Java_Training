package homework25;

public class MagicArrayGen <T> {
    private T[] array;
    int cursor;

    public MagicArrayGen() {
        array =(T[])new Object[10];
    }


    // конструктор принимающий в себя обычный массив и создающий MagicArray с такими же значениями

    public MagicArrayGen(T[] initialArray) {

        array = (T[]) new Object [initialArray.length * 2];

        for (int i = 0; i < initialArray.length; i++) {
            array[i] = initialArray[i];
        }
        cursor = initialArray.length;

    }


    // метод добавление в массив одного элемента

    void add(T value) {

        // проверка. Есть ли вообще свободное место во внутр массиве
        // если места нет, добавить его

        if (cursor == array.length - 1) {
            // расщирить массив перед добавлением нового элемента)
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }


    // Поиск элемента по значению

    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value))
                return i;
        }
        return -1;

    }
    // удаление элемента по индексу

    public T remove(int index) {
        if (index < 0 || index >= cursor) {
            return null;
        }

        T valueToRemove = array[index];
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
        return  valueToRemove;
    }

    // Удаление элемента по значению

    public boolean removeByValue(int value) {
        int index = -1;

        // Сначала ищем элемент с заданным значением
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) { // toDo
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int j = index; j < cursor - 1; j++) {
            array[j] = array[j + 1];
        }

        cursor--;

        return true; // удаление успешно
    }

    //  метод динамическое расширение массива

    public void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);


        T[] newArray = (T[])new Object[array.length * 2];


        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i]; // переписываю все значения из старого массива
        }

        // 3

        array = newArray;  // переменная array хранит ссылку на новый массив newArray
        System.out.println("Расширение массива завершено");
    }

    // возвращает строковое представление массива

    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]\n");

        }
        return result;

    }

    // Добавляем в массив несколько значений

    public void add(int... numbers) {
        // с numbers я могу обращаться точно также как со ссылкой на массив
        // System.out.println("Приняли несколько интов. А именно: " + numbers.length);
        //   System.out.println("Есть индекс у каждого инта, как в массиве. Под индексом 0: " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);

        }
    }

    // Текущее количество элементов в массиве

    public int size() {
        return cursor;
    }

    // Возвращает значение по индексу

    public int get(int index) {
        if (index >= 0 && index < cursor) {
            return (int)array[index];
        }
//  если индекс не корректный

        return Integer.MIN_VALUE; // хорошего решения нет
        //
    }
}


