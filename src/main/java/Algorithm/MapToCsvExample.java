package Algorithm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapToCsvExample {
    public static void main(String[] args) {
        Map<String, Integer> stockMap = new HashMap<>();
        stockMap.put("apple", 10);
        stockMap.put("banana", 20);
        stockMap.put("cherry", 30);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("stock.csv"))) {
            // 헤더, Map의 키-값 관계를 명시적으로 표현
            bw.write("key,value"); // item, quantity (현업 예시)
            bw.newLine();

            // Map 의 엔트리를 csv 라인으로 변환
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();

                // 키 정규화
                if(key.contains(",") || key.contains("\"") || key.contains("\n")) {
                    key = "\"" + key.replace("\"", "\"\"") + "\"";
                }

                bw.write(key + "," + value);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

