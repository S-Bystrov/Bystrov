package homework_11.task2;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    static int CAPACITY = 100;

    public static void main(String[] args) {
        List<Integer> integerNum = new java.util.ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            integerNum.add(0, (int) (Math.random() * 200)); // (int) (Math.random() разве не вернет 0 всегда?
        }
        System.out.println(integerNum);
        // удаление лучше вынести в отдельный метод
        Iterator<Integer> iterator = integerNum.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(integerNum);
    }
}
