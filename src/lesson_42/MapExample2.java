package lesson_42;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {

    public static void main(String[] args) {

        Map<Integer, String> mapColors = new HashMap<>(); // не упорядоченная (HashMap)

        mapColors.put(1, "red");
        mapColors.put(16, "green");
        mapColors.put(5, "blue");

        System.out.println(mapColors);

        System.out.println("mapColors.size() " + mapColors.size());

        System.out.println("mapColors.containsKey(32) : " + mapColors.containsKey(32)); // поиск по ключу
        System.out.println("mapColors.containsValue(\"blue\") : " + mapColors.containsValue("blue")); //поиск по значению

        String color = mapColors.get(16);
        System.out.println("color: " + color);
        System.out.println("mapColors.get(100) " + mapColors.get(100));

        // удалить

        String deletedValue = mapColors.remove(100);
        System.out.println("deletedValue: " + deletedValue);

        deletedValue = mapColors.remove(5);
        System.out.println();


        // void clear () - ОЧИСТИТЬ ВСЕ ЗНАЧЕНИЯ КАРТЫ
        // mapColors.clear();


        // boolean isEmpty()
        System.out.println(mapColors.isEmpty()); // возвращает true если карта пустая

        mapColors.put(7, "yellow");
        mapColors.put(8, "white");
        mapColors.put(24, "white");

        System.out.println(mapColors);

        System.out.println("\n=============================\n");


        // ПОЛУЧИТЬ КОЛЛЕКЦИЮ ВСЕХ ЗНАЧЕНИЙ КАРТЫ
        // Collection <V> values() - возвращает коллекцию из всех значений карты
        // Значения карты могут повторяться. У разных ключей допускаются одинаковые значения.

        Collection<String> values = mapColors.values();
        System.out.println("values.size(): " + values.size());
        System.out.println("values " + values);


        // ПОЛУЧИТЬ SET КЛЮЧЕЙ
        // Set<K> keySet - возвращает set остоящий из всех ключей

        Set<Integer> keys = mapColors.keySet();
        System.out.println(keys);
        // Могу перебрать все ключи в цикле - получить все значения
        for (Integer key : keys) {
            System.out.print(key + ": " + mapColors.get(key) + "; "); // напечатать ключ со значением
        }
        System.out.println();


        // Фокус: Между eySet -> map -> "живая связь". Удаляя ключ из keySet - и из map тоже удалятся соответствующая пара ключ-значение
        keys.remove(7); // удалить 7 ключ // из карты этот ключ со своим значением также удалится
        System.out.println(keys);
        System.out.println(mapColors);

        // между values и map - тоже связь

        values.remove("red");
        System.out.println(values);
        System.out.println(mapColors);

        // Todo Entry + replace

        // Map.Entry<K, V> - представляет собой пары ключ-значение
        /*
        МЕТОДЫ
        K getKey()
        V getValue()
        V setValue(V value) - заменяет значение, возвращает старое значение
         */

        // Set<Map.Entry<K, V>> entrySet - ВОЗВРАЩАЕТ SET ВХОЖДЕНИЙ ВСЕХ ПАР КЛЮЧ-ЗНАЧЕНИЕ
        // Тоже "живая" связь с картой.

        System.out.println("\n==================================================================================\n");

        Set<Map.Entry<Integer, String>> entrySet = mapColors.entrySet();
        System.out.println("entrySet: " + entrySet);

        for(Map.Entry<Integer, String> entry : mapColors.entrySet()){
            System.out.print("entry.getKey() " + entry.getKey());
            System.out.print(" -> ");
            System.out.println(entry.getValue());
            if(entry.getKey().equals(8)){
                entry.setValue("Java!"); // поменяли значение по ключу 8
            }
        }

        System.out.println("\n==================================================================================\n");
        System.out.println(mapColors);

        mapColors.put(10, "red"); // если ключа нет в карте - создается новая пара ключ-значение
        mapColors.put(10, "yellow"); // зге - если ключ уже есть - значение для этого ключа будет заменено (перезаписано)

        // replace vs put // ОТЛИЧИЯ
        mapColors.replace(11, "blue"); // replace - если ключа нет - НЕ создается новая пара ключ-значение
        mapColors.replace(10, "purple"); // replace - если ключ уже есть - значение ключа будет перезаписано

        System.out.println(mapColors);

        // Перебор всех пар ключ-значение "в функциональном стиле". Есть возможность применить какую-то функцию к ним
        // УДОБНЫЙ СПОСОБ РАСПЕЧАТАТЬ КАРТУ
        mapColors.forEach((key, value) -> System.out.println("key: " + key + " value: " + value) ); // как короткая запись цикла forEach


        mapColors.forEach((k, v) -> {
            System.out.println("Iteration:");
            System.out.println("kay: " + k + ", value: " + v);
            System.out.println("=========================\n");
        });



    }
}
