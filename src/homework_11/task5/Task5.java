package homework_11.task5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    static int CAPACITY = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            arrayList.add(i + 1);
        }
        // нужно было удалить все элементы, а не половину
        // удаление лучше выносить в отдельный метод
        int index = CAPACITY / 2;
        long startArrayList = System.currentTimeMillis();
        while (arrayList.size() > index) {
            arrayList.remove(index);
        }
        System.out.println(System.currentTimeMillis() - startArrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < CAPACITY; i++) {
            linkedList.add(i + 1);
        }
        long startLinkedList = System.currentTimeMillis();
        while (linkedList.size() > index) {
            linkedList.remove(index);
        }
        System.out.println(System.currentTimeMillis() - startLinkedList);
    }
}
