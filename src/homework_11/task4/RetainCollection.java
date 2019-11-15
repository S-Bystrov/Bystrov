package homework_11.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetainCollection {
    public static void main(String[] args) {
        List<Integer> firstCollection = new ArrayList<>();
        firstCollection.add(12);
        firstCollection.add(1);
        firstCollection.add(92);
        firstCollection.add(453);
        System.out.println(firstCollection);
        firstCollection.retainAll(Arrays.asList(1, 453));
        System.out.println(firstCollection);
    }
}
