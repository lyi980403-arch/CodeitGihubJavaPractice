package Head04_JCF;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 12, 18, 7, 3, 20);

        //TODO n >= 10 기준 true/false

        Map<Boolean, List<Integer>> partitioned = nums.stream()
                .collect(Collectors.partitioningBy(n -> n >= 10));

        System.out.println(partitioned);
    }
}
