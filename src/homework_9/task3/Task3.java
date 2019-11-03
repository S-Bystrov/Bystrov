package homework_9.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    private static final String FILE_REFERENCE = "src/homework_9/task2/Text.txt";

    public static void main(String[] args) throws IOException {
        try (FileReader readerText = new FileReader(FILE_REFERENCE);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
            while ((line = bReaderText.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
