package homework13.task10;

import homework13.task3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// +
public class Task10 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("mi A3", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("a65", "Siemens", 900));
        phones.add(new Phone("c35", "Siemens", 900));

        Map<String, Long> producersAndCount = phones.stream()
                .collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()));

        for (Map.Entry<String, Long> stringLongEntry : producersAndCount.entrySet()) {
            System.out.println(stringLongEntry);
        }
    }
}
