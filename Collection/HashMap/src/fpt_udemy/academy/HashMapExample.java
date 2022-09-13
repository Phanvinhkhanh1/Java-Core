package fpt_udemy.academy;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Student's data
        Student student1 = new Student(1, "Student 1");
        Student student2 = new Student(2, "Student 2");
        Student student3 = new Student(3, "Student 3");

        Map<Integer, Student> map = new HashMap<>();
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);

        //show map by using keySet()
        for (Integer key : map.keySet()) {
            Student student = map.get(key);
            System.out.println(key + " = " + student);
        }

        //show map by using entrySet()
        System.out.println("====================================");
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Student student = entry.getValue();
            System.out.println(key + " = " + student);
        }
    }

}
