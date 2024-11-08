package homeWork_40;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));

    }

    private static Character getFirstUniqueChar(String string){
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repetedChars = new HashSet<>();

        // перебираю буквы в цикле
        for (char ch: string.toCharArray()){
            // проверяю присутствует ли текущий символ в сете повторов
            if(repetedChars.contains(ch)){
                continue; // перейти к следующей итерации цикла

                /*
            1. Проверить есть ли символ в уникальных
            2. Если есть: убрать из списка уникальных и добавить в список повторов
             Если нет в уникальных, значит добавить
             */

            }if(uniqueChars.contains(ch)){
                uniqueChars.remove(ch); // убираю символ из уникальных
                repetedChars.add(ch); // добавляю в повторяющиеся

            }
            else uniqueChars.add(ch);
            // System.out.println("uniqueChars " + uniqueChars);
            //  System.out.println("repetedChars " +repetedChars);

            // вернуть первый символ из уникальных

         // Берем итератор, один раз вызываем next - получаем первый элементы
            // Проверяем, сет уникальных на пустоту при помощи тернарного оператора
        } return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

    }




    private static Character getFirstUniqueChar2(String string){
        Set<Character> uniqueChars = new LinkedHashSet<>();

        /*
        Перебрать все символы в строке
        Добавить символ в коллекцию уникальных символов. Если встретится повторяющийся символ = он не должен
         быть в коллекции уникальным

         */

        char[] chars = string.toCharArray(); // возвращает все
        for (char ch : chars){
            // true / false

            // Это НЕ РАБОТАЕТ. Отсекает только дважды встречающиея символы.
            // Третий повтор символа - записывает его в уникальные
            // Если метод add вернул fasle, значит добавить символ в set не получилось, потому что такой символ там уже есть
            if(!uniqueChars.add(ch)){
                // я только что добавила символ повторно
               uniqueChars.remove(ch);
            }

        }
        System.out.println("uniqueChars " + uniqueChars);
        return null;
    }
}
