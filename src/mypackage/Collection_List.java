package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_List {
    public static void main(String[] args) {
//        int[] arr = new int[3];
        List<Integer> list = new ArrayList<>();
        System.out.println("list.add(<int>)");

        list.add(5);
        list.add(10);
        list.add(9);

        System.out.println("list.get(<position>);");
        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println("list[2]: "+a);

        System.out.println("list.set(<position>, <value>)");
        list.set(2, 100);
        System.out.println("list.set(2, 100)");
        System.out.println("list[2]: "+list.get(2));

        System.out.println();
        System.out.println("list.remove(<position>)");

        System.out.println("list.get(1): "+list.get(1));
        System.out.println(list);
        list.remove(1);
        System.out.println("list.remove(1)");
        System.out.println("list.get(1): "+list.get(1));
        System.out.println(list);

        System.out.println();
        System.out.println("list.size()");
        System.out.println(list.size());
        list.add(9);
        System.out.println("list.add(9);");
        System.out.println(list.size());
        System.out.println(list);

        System.out.println();
        System.out.println("list.clear()");
//        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2.size());

        list2.addAll(list);
        System.out.println(list2.size());


        String name_l2 = "list2: ";
        String name_l = "list: ";

        System.out.println();
        System.out.println(".removeAll(list)");
        System.out.println(".size()");
        System.out.println(list2.size());
        System.out.println(name_l2+list2);
        System.out.println(name_l+list);
        System.out.println(".removeAll(list)");
        list2.removeAll(list);
        System.out.println(".size()");
        System.out.println(list2.size());
        System.out.println(list2);

        System.out.println();
        list.clear();
        System.out.println(".isEmpty()");
        System.out.println(list.isEmpty());

        list.add(5);
        list.add(10);
        list.add(9);

        System.out.println();
        System.out.println(".contains(<>)");
        System.out.println(list2.contains(2));

        System.out.println();
        System.out.println(".containsAll()");
        list2.addAll(list);
        System.out.println("list2.addAll(list)");
        System.out.println(list2.containsAll(list));
        list2.removeAll(list);
        System.out.println(list2);
        System.out.println("list2.removeAll(list)");
        System.out.println("list2.containsAll(list)");
        System.out.println(list2.containsAll(list));

        System.out.println();
        System.out.println("ITERATORS");
        Iterator<Integer> iterator = list2.iterator();
//        System.out.println("iterator.next()");
//        System.out.println(iterator.next());
//        System.out.println("iterator.next()");
//        System.out.println(iterator.next());

        System.out.println();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }
}
