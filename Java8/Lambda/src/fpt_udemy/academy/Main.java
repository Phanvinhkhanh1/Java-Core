package fpt_udemy.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Sayable1 {
    public String say();
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> languages = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        Collections.sort(languages, (o1, o2) -> o1.compareTo(o2));
        languages.stream()
                .forEach(System.out::println);
        System.out.println();
        Sayable1 s1 = () -> "I have nothing to say";
        System.out.println(s1.say());
        System.out.println();
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));

        list.stream()
                .filter(p -> p.price > 20000)
                .forEach(p -> System.out.println(p.toString()));
    }
}
