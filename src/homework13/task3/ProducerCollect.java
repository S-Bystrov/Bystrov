package homework13.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProducerCollect {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("mi A3", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("a65", "Siemens", 900));

        List<String> collect = phones.stream()
                .map(Phone::getProducer)
                .filter(ProducerCollect::filterProducer)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static boolean filterProducer(String phone) {
       // лучше сделать коллекцию из этих слов и вызывать у этой коллекции contains
        return "Xiaomi".equals(phone) || "Apple".equals(phone) || "Samsung".equals(phone);
    }
}
