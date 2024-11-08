package homeWork41;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    /*
    Частотный словарь слов: Напишите метод, который принимает строку текста
    и возвращает Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.


     */

    public static Map<String, Integer> getWordFrequency(String testString){
        testString = testString.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "").trim();
        String[] words = testString.split("\\s+");

        Map<String, Integer> mapResult = new HashMap<>();

        for (String word : words){
            Integer count = mapResult.get(word);
            if(count == null){
                count = 0;
            }
            mapResult.put(word, count +1);
        }return mapResult;
    }





    public static void main(String[] args) {
        String textExample = "apple, orange! apple banana apple, cherry";
        Map<String, Integer> result = getWordFrequency(textExample);

        // Выводим результат
        result.forEach((word, count) -> System.out.println(word + ": " + count));
    }
    }
