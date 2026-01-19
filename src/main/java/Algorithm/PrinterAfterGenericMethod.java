package Algorithm;

import java.util.List;
import java.util.function.Function;

public class PrinterAfterGenericMethod {
    public static <T> void printList(List<T> list, Function<T, String> formatter) {
        for (T item : list) {
            System.out.println(formatter.apply(item));
        }
    }
}
