package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + this.id + ", " + this.name + "]";
    }
}

public class ArrayListExample {
    public static final int NUM_OF_ELEMENT = 5;

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= NUM_OF_ELEMENT; i++)
            list1.add("0" + i);
        System.out.print("List1 = ");
        printData(list1);

        //addAll
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        list2.add("\\End.");
        list2.add("01");
        System.out.print("List2 = ");
        printData(list2);

        //indexOf
        System.out.println("indexOf 1 in list1 = " + list1.indexOf("01"));
        System.out.println("indexOf E in list2 = " + list2.indexOf("\\End."));

        //lastIndexOf
        System.out.println("indexOf 03 in list2 = " + list2.indexOf("01"));
        System.out.println("Last indexOf 03 in list2 = " + list2.lastIndexOf("01"));

        //remove
        System.out.print("List2 after remove 01 = ");
        list2.remove("01");
        printData(list2);

        //retainAll
        List<String> list3 = new ArrayList<>();
        list3.add("02");
        list3.add("09");
        System.out.print("List3 = ");
        printData(list3);
        List<String> list4 = new ArrayList<>(list1);
        list4.retainAll(list3);
        System.out.print("List4 = ");
        printData(list4);

        //removeAll
        List<String> list5 = new ArrayList<>(list1);
        list5.removeAll(list3);
        System.out.print("List5 = ");
        printData(list5);

        List<Student> students = new ArrayList<>(NUM_OF_ELEMENT);
        for (int i = 1; i <= NUM_OF_ELEMENT; i++) {
            students.add(new Student(i, "myName : " + i));
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void printData(List<String> list) {
        for (String item : list)
            System.out.print("" + item);
        System.out.println();

    }
}
