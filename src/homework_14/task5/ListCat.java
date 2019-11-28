package homework_14.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListCat implements Serializable {
    private static final String PATH = "src/homework_14/task5/";

    public static void main(String[] args) throws IOException {
        List<Cat> listCat = new ArrayList<>();
        listCat.add(new Cat("Bob", "white", 4));
        listCat.add(null);
        listCat.add(new Cat("Tom", "black", 2));
        listCat.add(null);
        System.out.println(listCat);

        File listCatFile = new File(PATH, "ListCat");
        String listCatPath = listCatFile.getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(listCatPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(listCat);
            oos.flush();
        }
        // было бы неплохо еще обратно прочитать из файла
    }
}
