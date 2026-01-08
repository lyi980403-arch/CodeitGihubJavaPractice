package Head04_JCF;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, String> nameLength = new Function<String, String>() {
            @Override
            public String apply(String s) {
                //return s.length();
                return s.toUpperCase();
            }
        };

        names.stream()
                .map(nameLength)
                .forEach(name -> System.out.println("Name: " + name));

    }
}
