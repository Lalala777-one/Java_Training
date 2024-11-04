package myExperience;

public enum Seasons {

    WINTER(8),
    SPRING(12),
    SUMMER(15),
    AUTUMN(10);

    private final int daylightHours;

    Seasons(int daylightHours) {
        this.daylightHours = daylightHours;
    }

    public int getDaylightHours() {
        return daylightHours;
    }
}

class Test1{
    public static void main(String[] args) {

        System.out.println(Seasons.SUMMER.getDaylightHours());

    }
}

/*
Задача 2: Время года и длина дня
Создайте перечисление для четырёх времён года. Добавьте в него поля для средней
продолжительности светового дня (в часах) и метод, который возвращает это значение.

Пример:

Зима: 8 часов.
Весна: 12 часов.
Лето: 15 часов.
Осень: 10 часов.
 */
