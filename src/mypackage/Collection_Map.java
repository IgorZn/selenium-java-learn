package mypackage;

import java.util.*;

public class Collection_Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> my_list = new ArrayList<>();

        my_list.add("Vasya");
        my_list.add("Petya");
        my_list.add("Dima");
        my_list.add("Masha");
        my_list.add("Tanya");

        System.out.println(my_list.get(0));

        map.put(1, "Black");
        map.put(2,"White");
        map.put(3,"Yellow");
        map.put(13,"Gooo");

        System.out.println("map.get(1)");
        System.out.println(map.get(1));
        System.out.println(map.get(13));

        System.out.println();
        System.out.println("map.size()");
        System.out.println(map.size());

        System.out.println();
        System.out.println("map.clear()");
        map.clear();
        System.out.println("map.size()");
        System.out.println(map.size());


        System.out.println();
        for(int i = 0; i < 5; i++){
            map.put(i, my_list.get(i));
        }

        int i = 0;
        while (map.containsKey(i)){
            System.out.println(map.get(i));
            System.out.println(map.containsValue(map.get(i)));
            System.out.println();
            i++;
        }

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        System.out.println();
        System.out.println(map.get(2));
        map.put(2, "Toooooo");
        System.out.println(map.get(2));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Igor", "Znamensky");
        map2.put("Maria", "Znamensky");
        map2.put("Nadezda", "Znamensky");
        map2.put("Mama", "Znamensky");
        map2.put("Alisa", "Znamensky");
        map2.put("Iliya", "Znamensky");

        System.out.println();
        for(String key: map2.keySet()){
            System.out.println(key);
            System.out.println(map2.get(key));
            System.out.println();
        }






    }
}
