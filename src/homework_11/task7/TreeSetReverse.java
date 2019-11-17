package homework_11.task7;

import java.util.Comparator;
import java.util.TreeSet;

// +
public class TreeSetReverse {
    public static void main(String[] args) {
        TreeSet<Integer> integer = new TreeSet<>(Comparator.reverseOrder());
        int size = 10;
        for (int i = 0; i < size; i++) {
            integer.add((int) (Math.random() * 100));
        }
        System.out.println(integer);
    }
}
