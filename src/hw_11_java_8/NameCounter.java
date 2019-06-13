package hw_11_java_8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameCounter {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");
        System.out.println(countNames(names));

    }

    static Map<String, Integer> countNames(Stream<String> names) {
        return names
                .collect(Collectors.toMap(s -> s, s -> 1, (a, b) -> a + 1));
    }
}
