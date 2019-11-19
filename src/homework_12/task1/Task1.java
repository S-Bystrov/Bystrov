package homework_12.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int capacity = 20;
        // стоило сделать класс с полем timeAdded и сетать его перед добавлением в хранилище
        List<String> warehouse = new ArrayList<>(capacity);
        productAdd(warehouse, "apple");
        productAdd(warehouse, "corn");
        System.out.println(warehouse);
    }

    public static void productAdd(List warehouse, String product) { // List<String>
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy:hh-mm-ss.");
        warehouse.add(product + "| was added:" + LocalDateTime.now().format(dtf));
    }
}
