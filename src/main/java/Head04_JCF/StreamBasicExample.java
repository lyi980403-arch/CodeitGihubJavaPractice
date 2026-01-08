package Head04_JCF;

import java.util.Arrays;
import java.util.List;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Park", "Lee", "Choi", "Kim", "Paik");

        names.stream()
                .filter(name -> name.startsWith("P"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
