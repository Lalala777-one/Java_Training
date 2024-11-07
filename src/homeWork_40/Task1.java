package homeWork_40;

import java.util.*;

public class Task1 {

    public static void test(String testStr) {

        // Заменяем все не буквы на пустоту
        String newString = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");


        // Преобразование строки в массив слов
        String[] words = newString.split(" ");


        // Arrays.asList(T[] array) -> преобразует массив в коллекцию
        List<String> list = Arrays.asList(words);


        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        //  Сортировка сначала по длине, а потом по алфавиту
        //  (для одинаковых по длине слов).

        Comparator<String> lengthComparator = (word1, word2) -> {
            //  по длине
            int lengthComparison = Integer.compare(word1.length(), word2.length());

            // по алфавиту
            if (lengthComparison == 0) {
                return word1.compareTo(word2);
            }

            return lengthComparison;
        };

        //
        List<String> sortedWords = new ArrayList<>(uniqueWords);
        sortedWords.sort(lengthComparator);

        //
        System.out.println(sortedWords);
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        test(testString);
    }

}

