package fpt_udemy.academy;

import java.nio.file.Paths;
import java.util.*;

public class CollectionExample {
    public static final int NUM_OF_ELEMENTS = 5;

    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENTS; i++) {
            arrayList.add("0" + i);
        }
        System.out.println("ArrayList : " + arrayList);

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 1; i <= NUM_OF_ELEMENTS; i++) {
            linkedList.add("0" + i);
        }
        System.out.println("LinkedList : " + linkedList);

        //HashSet
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 1; i <= NUM_OF_ELEMENTS; i++) {
            hashSet.add("0" + i);
        }
        System.out.println("HashSet : " + hashSet);

        //HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 1; i <= NUM_OF_ELEMENTS; i++) {
            hashMap.put("Key" + i, i);
        }
        System.out.println("HashMap : " + hashMap);

        //Print results for ArrayList
        //Using ForEach
        System.out.println("Use Foreach");
        for (String item : arrayList) {
            System.out.print(item + " ");
        }

        //Use For iterator
        System.out.println("\nUsing For Iterator");
        for (Iterator<String> iterator = arrayList.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }

        //Use For Each Java8
        System.out.println("\nUsing Foreach Java8");
        arrayList.forEach(element -> System.out.print(element + " "));

        //Use Stream Foreach Java8
        System.out.println("\nUse Stream Foreach Java8");
        arrayList.stream().forEach(s -> System.out.print(s + " "));

        //Print results for Map
        //Use keySet method
        System.out.println("Use KeySet(");
        for (String key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            System.out.print(key + " = " + value + " , ");
        }

    }
}
