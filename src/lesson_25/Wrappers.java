package lesson_25;

import homework_18.Dog;

public class Wrappers {
    /*

    КЛАССЫ-ОБЕРТКИ ИСПОЛЬЗУЮТСЯ ДЛЯ ПРЕДСТАВЛЕНИЯ ПРИМИТИВНЫХ ТИПОВ ДАННЫХ КАК ОБЪЕКТОВ

    Byte -> обертка для byte
    Short -> обертка для short
    Integer -> обертка для int
    Long -> обертка для long
    Float -> обертка для float
    Double -> обертка для double
    Character -> обертка для char
    Boolean -> обертка для boolean
     */
    public static void main(String[] args) {
        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // автораспаковка. Из типа  Integer автоматически преобразовало в примитив int

        // Сравнение объектов
        // Кеширование объектов в диапазоне от -128...127

        Integer a = 127;
        Integer b = 127;
        // Так как это ссылочный тип данных, оператор == сравниваются ссылки

        System.out.println(a == b);
        System.out.println("a.equals(b): " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);
        System.out.println("c.equals(d): " + c.equals(d));


        System.out.println("\n================================\n");

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue " + maxValue);
        Integer minValue = Integer.MIN_VALUE;
        System.out.println("minValue " + minValue);

        // СХОЖИЕ МЕТОДЫ ДЛЯ ВСЕХ ОБЕРТОЧНЫХ ТИПОВ
        // 1. valueOf() преобращует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);

        System.out.println("e == f: " + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println( intStr + 100);

        Double doubleWrap = Double.valueOf(154.5);

        // 2. parseXXX() - преобразует стоку в соответствующий примитив
        // "456"
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67");
        System.out.println(d1);

        // 3. toString - возвращает строковое представление числа
        System.out.println(doubleWrap);
     }
}
