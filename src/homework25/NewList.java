package homework25;

public class NewList<T> implements MyList<T> {

    private T[] array;
    private int size;

    public NewList() {
        array = (T[]) new Object[10]; // Начальный размер массива
        size = 0;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2]; // Увеличиваем размер в 2 раза
        System.arraycopy(array, 0, newArray, 0, size); // Копируем старый массив в новый
        array = newArray;
    }

    @Override
    public void add(T value) {
        if (size == array.length) {
            resize();
        }
        array[size++] = value;
        size++;
    }


    @Override
    public void addAll(T... values) {

        for (int i = 0; i < values.length; i++) {
            add(values[i]);

        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value))
                return i;

        }
        return Integer.MIN_VALUE;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = size - 1; i > 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }


    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean remove(T value) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        for (int j = index; j < size - 1; j++) {
            array[j] = array[j + 1];
        }

        size--;

        return true;
    }


    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        T valueToRemove = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return valueToRemove;

    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона: " + index);
        }
        return array[index];
    }

    @Override
    public T[] toArray() {
        if (size == 0) return (T[]) new Object[0];

        T[] resultArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            resultArray[i] = array[i];

        }
        return resultArray;
    }

    @Override
    public void set(int index, T value) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона: " + index);
        }
        array[index] = value;

    }
}


