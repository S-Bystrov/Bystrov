package homework_9.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    private static final String DIRECTORY = "src/homework_9/task2";

    public static void main(String[] args) throws IOException {
        File textFile = new File(DIRECTORY, "Text.txt");
        String textFilePath = textFile.getAbsolutePath();
        try (FileWriter fr = new FileWriter(textFilePath)) {
            String text = "Hello from Java";
            int count = 0;
            int max = 10000;
            while (count != max) {
                fr.write(text);
                fr.flush();
                count++;
            }
        }

    }
}
