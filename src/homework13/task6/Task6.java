package homework13.task6;

import homework13.task3.Phone;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// +
public class Task6 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("mi A3", "Xiaomi", 400));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("a65", "Siemens", 900));

        List<Phone> distinct = phones.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);
    }
}
