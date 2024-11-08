package homeWork41;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersectionMap(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }// main

  public  static <String, Integer>  Map<String, Integer> intersectionMap(Map<String, Integer> map1, Map<String, Integer> map2 ){
      Map<String, Integer> result = new HashMap<>(map1);

      Set<String> keys1 = map1.keySet();
      Set<String> keys2 = map2.keySet();

      keys1.retainAll(keys2);

      Map<String, Integer> resultMap = new HashMap<>();

      for (String key : keys1) {
          resultMap.put(key, map1.get(key));
      }

return resultMap;
  }


    }
