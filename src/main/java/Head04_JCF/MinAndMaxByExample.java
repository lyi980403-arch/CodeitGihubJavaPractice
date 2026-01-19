package Head04_JCF;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAndMaxByExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

        //TODO 사전 순 최소값과 최대값 계산
        Optional<String> minFuit = fruits.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        Optional<String> maxFuit = fruits.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()));

        System.out.println("Lexicographically smallest fruit: " + minFuit.orElse("None"));
        System.out.println("Lexicographically biggest fruit: " + maxFuit.orElse("None"));
    }
}
