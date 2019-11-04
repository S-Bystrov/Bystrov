package homework_9.task7;

import java.io.File;

public class Task7 {
    private static final String FILE_REFERENCE = "src/";

    public static void main(String[] args) {
        File directory = new File(FILE_REFERENCE);
        if (directory.isDirectory()) {
            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " = folder");
                } else {
                    System.out.println(item.getName() + " = file");
                }
            }
        }
    }
}
