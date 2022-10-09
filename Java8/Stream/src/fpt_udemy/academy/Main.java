package fpt_udemy.academy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Get collections from stream
        Stream<String> stream = Stream.of("Java", "C++", "C", "C#", "JavaScript", "NodeJS");
        List<String> stringList = stream.collect(Collectors.toList());
        for (String element : stringList) {
            System.out.println(element);
        }
        System.out.println();
        //Get Arrays from stream
        Stream<String> stream1 = Stream.of("Java", "C++", "C", "C#", "JavaScript", "NodeJS");
        String[] languages = stream1.toArray(String[]::new);
        System.out.println(Arrays.toString(languages));
        System.out.println();
        //Use filter() function in Stream
        Stream.iterate(1, n -> n + 1)
                .limit(6)
                .filter(e -> e % 3 == 0)
                .forEach(System.out::println);
        System.out.println();
        //Use map() in stream
        Stream<String> stream2 = Stream.of("Java", "C++", "C", "C#", "JavaScript", "NodeJS");
        stream2
                .filter(element -> element.length() >= 5)
                .map(element -> element.toUpperCase())
                .forEach(System.out::println);
        System.out.println();
        //Use sorted() in stream
        //Sort increase order in stream
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Java", "C++", "C", "C#", "JavaScript", "NodeJS");
        streamSupplier.get().sorted().forEach(System.out::println);
        System.out.println();
        //Sort decrease order in stream
        streamSupplier.get().sorted(((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);
    }
}
