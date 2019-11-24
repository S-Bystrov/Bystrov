package homework13.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        List<String> stringArray = new ArrayList<>();
        stringArray.add("Java");
        stringArray.add("multiplication");
        stringArray.add("apple");
        stringArray.add("i");
        System.out.println(stringArray);

        Optional<String> maxString = stringArray.stream()
                .max(Comparator.comparing(String::length));
         // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(maxString.get());
    }
}
