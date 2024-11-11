package homeWork_42;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        String testStr = "Hello our beautiful World. This is our test string.";
        HashMap<Integer, Integer> resultMap = countWordsOfLength(testStr);

        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()){
            System.out.println("Word length " + entry.getKey() + ": " + entry.getValue() + " words");
        }

    } // main

    public static HashMap<Integer, Integer> countWordsOfLength(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").trim();
        String[] words = str.split("\\s+");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (String word : words) {
            int wordLength = word.length();

            // Если длина больше 0
            if (wordLength > 0) {
                // Обновляем значение в HashMap: если длина уже есть, увеличиваем счетчик, если нет - добавляем
                map.put(wordLength, map.getOrDefault(wordLength, 0) + 1);
            }
        }
        return map;
    }
}
