package homework_10.task2;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    /*private static final String DIRECTORY = "src/homework_10/task2/Employee";*/

    public static void main(String[] args) throws IOException {
        File file = new File("src/homework_10/task2/Employee");
        System.out.println(file.getName());
/*        String arrayFilePath = file.getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(arrayFilePath);
             ObjectOutputStream dos = new ObjectOutputStream(fos)) {
            int size = 10;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random()) * 100;
            }
            dos.writeObject(array);
            dos.flush();}*/


        FileRenamer.strategy = RenameStrategy.TO_LOWER_CASE;
        FileRenamer.rename(file);
        File file2 = new File("src/homework_10/task2");
        System.out.println(file2.getName());


    }
}
