package homework_9.task7;

import java.io.File;

public class Task7 {
    private static final String FILE_REFERENCE = "src/";

    public static void main(String[] args) {
        File directory = new File(FILE_REFERENCE);
        dir(directory);
    }


    public static void dir(File directory) {
        if (directory.isDirectory()) {
            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {
                    char triangle = 0x25BA;
                    System.out.println(triangle + item.getName());
                    dir(item);
                } else {
                    char symbol = 0x251C;
                    System.out.println("\t" + symbol + item.getName());
                }
            }
        }
    }
}
