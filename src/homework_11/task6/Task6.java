package homework_11.task6;

import java.util.ArrayList;
import java.util.LinkedList;


public class Task6 {
    static int CAPACITY = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            arrayList.add(i + 1);
        }
        
        // удаление лучше выносить в отдельный метод
        long startArrayList = System.currentTimeMillis();
        while (arrayList.size() != 0) {
            arrayList.remove(0);
        }
        System.out.println(System.currentTimeMillis() - startArrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < CAPACITY; i++) {
            linkedList.add(i + 1);
        }
        long startLinkedList = System.currentTimeMillis();
        while (linkedList.size() != 0) {
            linkedList.removeFirst();
        }
        System.out.println(System.currentTimeMillis() - startLinkedList);
    }
}
