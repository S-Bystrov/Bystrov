package homework_14.task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ListCatReader {
    private static final String PATH = "src/homework_14/task5/ListCat";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(PATH);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Cat> listCat = (List<Cat>) ois.readObject();
            System.out.println(listCat);
            System.out.println(listCat.contains(null));
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
        }
    }
}
