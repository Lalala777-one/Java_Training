package homeWork_40;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

    }

    public static List<String> getUniqueSortedWords(String testString){
        /*
        1. Избиваться от знаков препинания
        2. Разобрать на слова
        3. Поместить в какую-то коллекцию, которая мне обеспечит уникальность и сортировку
        4. Преобразовать в список и вернуть
         */

        // заменяю все не буквы и не пробелы на пустоту - удаляю все из строки. Изначальная строка не меняется
        // метод trim удибает пробелы в начале и в конце строки
        testString = testString.trim().replaceAll("[^a-zA-Z0-9а-яА-Я]", "");

        //разбить на слова по пробельному символу "+" означает - в любом количества (в случае если между словами будет несколько пробелов"
        String [] words = testString.split("\\s+");

        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        //преобразую массив в список и передаю в метод addAll (в set будут добавлены все элементы из списка слов)
        // Set обеспечит сортировку и удалит дубликат
        uniqueWords.addAll(Arrays.asList(words));

        return new ArrayList<>(uniqueWords);
    }

}

