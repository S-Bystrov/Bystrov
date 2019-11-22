package homework13.task8;

import homework13.task3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 200));
        phones.add(new Phone("mi A3", "Xiaomi", 400));
        phones.add(new Phone("S10", "Samsung", 350));
        phones.add(new Phone("3310", "Nokia", 1000));
        phones.add(new Phone("a65", "Siemens", 900));
        phones.add(new Phone("c35", "Siemens", 900));

        Map<String, List<Phone>> phonesProducer = phones.stream()
                .collect(Collectors.groupingBy(Phone::getProducer));

        for (Map.Entry<String, List<Phone>> item : phonesProducer.entrySet()) {

            System.out.println(item.getKey());
            for (Phone phone : item.getValue()) {

                System.out.println(phone.getModel());
            }
            System.out.println();
        }
    }
}
