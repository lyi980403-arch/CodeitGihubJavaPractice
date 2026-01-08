package Head04_JCF;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(System.out::println);

        names.stream()
                .filter(s -> s.length() >= 5)
                .forEach(System.out::println);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
