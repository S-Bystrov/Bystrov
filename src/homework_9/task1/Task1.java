package homework_9.task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task1 {
    private static final String DIRECTORY = "src/homework_9/task1";

    public static void main(String[] args) throws IOException {
        File arrayFile = new File(DIRECTORY, "Array.txt");
        String arrayFilePath = arrayFile.getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(arrayFilePath);
             ObjectOutputStream dos = new ObjectOutputStream(fos)) {
            int size = 10;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random()) * 100;
            }
            dos.writeObject(array);
            dos.flush();
        }
    }
}
