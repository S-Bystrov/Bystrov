package homework_10.task2;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    private static final String FILE_PATH = "src/homework_10/task2/files/ASDfG";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        RenameStrategy newName = RenameStrategy.TO_UPPER_CASE;
        if (newName.renameFile(file)) {
            System.out.println("Файл переименован успешно");
            ; // <- авторская фишечка?
        } else {
            System.out.println("Файл не был переименован");
        }
    }
}
