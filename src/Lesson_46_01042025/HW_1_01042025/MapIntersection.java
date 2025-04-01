package Lesson_46_01042025.HW_1_01042025;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Пересечение двух карт:
Реализуйте метод, который принимает две карты Map<String, Integer> и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.

Для совпадающих ключей значение можно брать из любой карты

 Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));
Copy
//Output
banana: 20
cherry: 30
 */

public class MapIntersection {
    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, map1.get(key)); // Можно взять значение из любой карты, здесь из первой
            }
        }
        return resultMap;
    }


}


