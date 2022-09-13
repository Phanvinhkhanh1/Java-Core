package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list.add("0" + i);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("Using Iterator : Only traverse list in forward direction : ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("Using ListIterator : Traverse List in forward directions : ");
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\n");
        System.out.println("Using ListIterator : Traverse List in backward directions : ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
