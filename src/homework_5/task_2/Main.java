package homework_5.task_2;

import java.util.Arrays;

// +
public class Main {
// пустая строка не нужна
    public static void main(String[] args) {

        Warehouse wareHouse = new Warehouse(new Wire[]{
                new Wire(2, 2.5),
                new Wire(7, 2.5),
                new Wire(4, 1.5),
                new Wire(10, 3.5)
        });
        System.out.println(Arrays.toString(wareHouse.getArray()));

        for (int i = 0; i < 10 ; i++) {
            System.out.println(wareHouse.next());
        }
    }
}
