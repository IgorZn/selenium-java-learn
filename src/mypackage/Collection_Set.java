package mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set {
    public static void main(String[] args) {
        /*  Set это множество объектов без индекса и все объекты явл
        *   уникальными  */

        Set<Integer> my_set = new HashSet<>();
        my_set.add(10);
        my_set.add(20);
        my_set.add(30);
        my_set.add(40);

        System.out.println("my_set.size()");
        System.out.println(my_set.size());

        System.out.println();
        System.out.println("Use Iterator to pass through my_set");
        Iterator<Integer> interator = my_set.iterator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }
        my_set.remove(40);
//        my_set.clear();

        System.out.println();
        System.out.println("Now use `for`");
        for(int i: my_set){
            System.out.println(i);
        }

        System.out.println();
        my_set.clear();
        System.out.println("my_set.clear()");
        System.out.println("my_set.size()");
        System.out.println(my_set.size());

        Set<Integer> set_2 = new HashSet<>();

        for (int i = 0; i < 10; i++){
            set_2.add(i);
        }
        System.out.println(set_2.size());
        System.out.println(set_2.contains(11));
        System.out.println(set_2.contains(1));





    }
}
