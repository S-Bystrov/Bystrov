package homework_9.task6;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private static final String FILE_REFERENCE = "src/homework_9/task6/map.jpg";

    public static void main(String[] args) throws IOException {
        try (FileWriter fr = new FileWriter(FILE_REFERENCE, true)) {
            String text = "\n" + "Map of countries where Alexander Soloduha is listened to";
            fr.write(text);
            fr.flush();
        }
    }
}
