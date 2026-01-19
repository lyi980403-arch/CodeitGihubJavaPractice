package Algorithm;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))){
            bw.write("Hello File I/O");
            bw.newLine();
            bw.write("Using BufferedWriter for better performance");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
