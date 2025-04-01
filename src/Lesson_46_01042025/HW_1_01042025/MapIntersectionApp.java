package Lesson_46_01042025.HW_1_01042025;

import java.util.HashMap;
import java.util.Map;

import static Lesson_46_01042025.HW_1_01042025.MapIntersection.intersection;

public class MapIntersectionApp {

    public static void main(String[] args) {
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
    }

}
