package homework_9.task7;

import java.io.File;

public class Task7 {
    private static final String FILE_REFERENCE = "src/";
    static int level = 0;
    static String tab;

    public static void main(String[] args) {
        File directory = new File(FILE_REFERENCE);
        dir(directory);
    }

    public static void dir(File directory) {
        if (directory.isDirectory()) {
            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {

                    System.out.println(tab + (char) 0x25BA + item.getName());

                    dir(item);
                } else {
                    System.out.println(tab + (char) 0x251C + item.getName());
                }
                tab = tab + "\t";
            }
            tab = "";
        }
    }
}
