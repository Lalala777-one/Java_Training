package homeWork_42;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        String testStr = "Hello our beautiful World. This is our test string.";
        Map<Integer, Integer> resultMap = countWordsOfLength(testStr);

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()){
            System.out.println("Word length " + entry.getKey() + ": " + entry.getValue() + " words");
        }

    } // main

    public static Map<Integer, Integer> countWordsOfLength(String str) {

        // привести текст к нижнему регистру, удалить не буквы(знаки препинания)
        str = str.toLowerCase().replaceAll("[^a-zа-я-Я0-9\\s]", "").trim();

        // Разбиваю текст на слова
        String[] words = str.split("\\s+");

        Map<Integer, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                int wordLength = word.length();

                // Если длина больше 0
                if (wordLength > 0) {
                    // Обновляем значение в HashMap: если длина уже есть, увеличиваем счетчик, если нет - добавляем
                    map.put(wordLength, map.getOrDefault(wordLength, 0) + 1);
                }
            }
        }
        return map;
    }
}
