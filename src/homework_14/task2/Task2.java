package homework_14.task2;

import java.io.*;

public class Task2 {
    private static final String PATH = "src/homework_14/task2/Text.txt";

    public static void main(String[] args) throws IOException {
        String string = "pancakes";
        try (FileReader readerText = new FileReader(PATH);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
            while ((line = bReaderText.readLine()) != null) {
                if (line.contains(string)) {
                    System.out.println(line);
                }
            }
        }
    }
}
