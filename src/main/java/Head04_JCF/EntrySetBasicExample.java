package Head04_JCF;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Korea", "Seoul");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washington D.C.");
        capitals.put("China", "Beijing");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("U.K", "London");

        for (Map.Entry<String, String> entry: capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());

        }
    }
}
