package homework_9.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private static final String FILE_REFERENCE = "src/homework_9/task6/map.jpg";

    public static void main(String[] args) throws IOException {
        try (FileReader readerText = new FileReader(FILE_REFERENCE);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
            // таким образом ты читаешь весь файл, а нужно было только часть с секретным сообщением
            while ((line = bReaderText.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
