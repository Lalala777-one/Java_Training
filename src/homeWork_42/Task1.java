package homeWork_42;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        String st1 = "triangle";
        String st2 = "integral";

        boolean result = isStringsAnagram(st1, st2);
        System.out.println("Are these strings anagrams? " + result);

    }

    public static boolean isStringsAnagram(String st1, String st2){

        st1 = st1.replaceAll("\\s+", "").toLowerCase();
        st2 = st2.replaceAll("\\s+", "").toLowerCase();

        if(st1.length() != st2.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < st1.length(); i++) {
            // Для первой строки
            char c1 = st1.charAt(i);
            map1.put(c1, map1.getOrDefault(c1, 0) + 1);

            // Для второй строки
            char c2 = st2.charAt(i);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        } return map1.equals(map2);
    }


}
