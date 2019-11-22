package homework13.task7;

import homework13.task3.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("mi A3", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("a65", "Siemens", 900));

        Optional<Phone> minPrice = phones.stream()
                .min(Comparator.comparing(Phone::getPrice));
        System.out.println(minPrice.get());
    }
}
