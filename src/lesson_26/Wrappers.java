package lesson_26;

import homeWork05.Task1;

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
        System.out.println(intStr + 100);

        Double doubleWrap = Double.valueOf(154.5);

        // 2. parseXXX() - преобразует стоку в соответствующий примитив
        // "456"
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble("345.67");
        System.out.println(d1);

        // 3. toString - возвращает строковое представление числа
        System.out.println(doubleWrap);

        // в Boolean есть три значение true, false, null

        Boolean boolWrapper = true;
        boolWrapper = null;

        // 4. equels - сравнение объектов на равенство по значению


        Long l1 = Long.valueOf(200);
        // Вариант 2
        l1 = 200L;

        System.out.println("l1.equals(200) " + l1.equals(200L)); // true
        System.out.println("l1.equals(200) " + l1.equals(200)); // false
        // Мы хотим сравнить объект типа Long с примитивом int
        // Метод equels принимает объект типа Object. По этому примитив должен быть приведен к ссылочному типу.
        // Для примитива  int его обертка (ссылочный тип) это Integer
        // Следовательно int приводится к Integer
        // Логика сравнения метода equals


        Integer i1 = 150;
        System.out.println("i1.equals(150) " + i1.equals(150)); // эти 150 в скорбках автоматически приводится к Integer

        // 5. compareTo() - сравнивает текущий объект с другим объектом того же типа.
        //  Может определить  какой из объектов больше

        // 1  если наш объект больше чем тот объект с которым сравниваем
        // -1 если наш объект меньше
        // 0 если объект равен по значению

        Integer iMax = 250;
        Integer iMin = 125;
        Integer iSuper = 500;


        System.out.println(iMax + ".compereTo(" + iMin + ") -> " + iMax.compareTo(iMin));
        System.out.println(iMax + ".compereTo(" + iSuper + ") -> " + iMax.compareTo(iSuper));
        System.out.println(iMax + ".compereTo(" + 250 + ") -> " + iMax.compareTo(250));


        // 6. xxxValue() возвращает значение объекта в виде примитивного типа


        Double d2 = Double.valueOf(125.56);    // doubleValue - принудительная упаковка. Примитив в Обертку
        double dPrimitive = d2.doubleValue(); // явная принудительная распаковка из Обертки в примитив

        /*
        Все числовые обертки наследуются от абстрактного класса Number. У класса Number есть свои методы

        Byte
        Short
        Integer
        Long
        Float
        Double

         */

        /*
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()

         */

        Integer integer = 31844;
        Double doubleVal = 235.76;

        System.out.println(integer.doubleValue());

        short shortPrim = integer.shortValue();

        int intPrim = doubleVal.intValue();
        System.out.println("intPrim " + intPrim);

    }
}


