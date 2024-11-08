package lesson_41;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {


        // Конструкторы
        Map<String, Integer> test = new HashMap<>(); // создает пустой список, 16 корзин, коэффициент загрузки 0.75 (при 16 корзинах это 12 элементов) -
        // происходит расширение количества корзин, добавится еще 16, и пройдет пересчет, карты перераспределятся по другим ячейкам

        test = new HashMap<>(32);// создает пустой список. 32 корзины. коэффициент загрузки 0.75 (при 16 корзинах это 24 элементов)

        test = new HashMap<>(32, 0.90f); // создает пустой список. 32 корзины. коэффициент загрузки 0.90 (29 элементов)

        test = new HashMap<>(new HashMap<>()); // ринимает другую map - копирует все пары ключ-значение




        Map<Integer, String> ollTable = new Hashtable<>(); // устаревшая, медленная. НЕ РЕКОМЕНДУЕТСЯ ИССПОЛЬЗОВАТЬ


        // Конструктор. Создает пустую карту. (мапу) емкостью 16 корзин
        Map<Integer, String> map = new HashMap<>();

       // БАЗОВЫЕ ОПЕРАЦИИ

        // V put(K kay, V value) Добавление значения // Исспользуется редко
        // Возвращает страрое значение, соответствующее ключу ранее. Если не было ключа - вернет null

        String oldValue = map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "Java");
        map.put(4, "Python");

        oldValue = map.put(4, "Orange");

        System.out.println("map.put(4, Orange) " + oldValue);


        System.out.println("map: " + map);

        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(0, "Python");
        newMap.put(2, "New Value");

        System.out.println("newMap " + newMap);
        // putAll - принимает карту и копирует все пары ключ значения из этой карты
        map.putAll(newMap); // должен быть такой же тип ключа и значения. Если ключи совпадут - значения будут перезаписаны
        System.out.println("map " + map);

        // как определить был ли ключ??
        // boolean containsKey(Object obj) - вернет true если карта содержит указанный ключ
        // boolean containsValue(Object obj) - вернет true если карта содержит указанное значение (одно или несколько)
       // ключи уникальны, значения могут повторяться

        System.out.println("map.containsKey(8) " + map.containsKey(8)); // такого ключа нет false
        System.out.println("map.containsKey(1) " + map.containsKey(1)); // такой ключ есть true

        System.out.println("map.containsValue(\"Java\") " + map.containsValue("Java")); // такого значения нет , вернет true
        System.out.println("map.containsValue(\"NoValue\") " + map.containsValue("NoValue")); // такого значения нет, вернется false


        System.out.println("\n ======= Получение значения по ключу==========");

// get (Object key) - возвращает значение по ключу
        String value = map.get(3);
        System.out.println("value " + value);
        System.out.println("map.get(100) " + map.get(100)); // ключа нет - вернет null

        // V getOrDefault(Object key, V defaultValue) возвращает значение по ключу. Если ключа нет - вернет defaultValue

        value = map.getOrDefault(3, "Default");

        System.out.println("(3, \"Default\") " + value);

        value = map.getOrDefault(100, "Default"); // ключа нет, вернет Default
        System.out.println("(100, \"Default\") " + value);


        System.out.println("\n ======= Удаление пары ключ-значение по ключу==========");


        System.out.println(map);
        // V remove (Object key) - Удаляет пару ключ значение. Возвращает значание или null
        System.out.println("map.remove(100) " + map.remove(100)); // ключа нет, ничего не удалит
        System.out.println("(map.remove(4) " + map.remove(4)); // ключ есть, удалит пару ключ-значение, вернет значение которое было у ключа

        System.out.println(map);


    }
}
