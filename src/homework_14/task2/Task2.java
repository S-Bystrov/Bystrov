package homework_14.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    private static final String PATH = "src/homework_14/task2/Text.txt";
    private static final String PATH_NEW = "src/homework_14/task2/";

    public static void main(String[] args) throws IOException {
        File textNew = new File(PATH_NEW, "TextNew.txt");
        String string = "pancakes";
        try (FileReader readerText = new FileReader(PATH);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
            String textFilePath = textNew.getAbsolutePath();
            try (FileWriter fr = new FileWriter(textFilePath)) {
                while ((line = bReaderText.readLine()) != null) {
                    if (line.contains(string)) {
                        fr.write(line + "\n");
                    }
                }
                fr.flush();
            }
        }
    }
}
