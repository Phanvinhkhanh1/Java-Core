package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Student's data
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");
        Student student3 = new Student(3, "Student 3");
        Student student4 = new Student(4, "Student 4");
        Student student5 = new Student(5, "Student 5");

        //Init map
        Map<Integer, Student> studentMap = new TreeMap<>();
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);
        studentMap.put(student4.getId(), student4);
        studentMap.put(student5.getId(), student5);

        // show map using method keySet()
        for (Integer key : studentMap.keySet()) {
            Student value = studentMap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("---");

        // show map using method keySet()
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }

    public static void printData(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
            ;
        }
    }
}
