package Lesson_3.L_3_GB;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapApp {
    public static void main(String[] args) {

        //  equals
        //  hashCode

        Map<String, Integer> map = new HashMap<>();

        map.put("key", 100);
        map.put("key", 200);

        map.containsKey("key"); //  поиск по ключу

        map.remove("key"); //   удаление

        map.size(); //  вернуть размер мапы

        map.getOrDefault("key123", 10); //  вернёт 10, если такого объекта нет

        map.get("key"); // если не вернёт null

        map.isEmpty();  //  проверка на пустоту

        map.values();   //  Collection

        map.keySet();   //  Set


        /*-------------Set-------------------*/

        Set<Integer> set = new HashSet<>();



    }
}
