package homework_10.task2;

import java.io.File;

public class FileRenamer {

    public static RenameStrategy strategy;

    public static void rename(File file) {
        strategy.rename(file);
    }

}
