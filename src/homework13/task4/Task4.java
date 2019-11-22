package homework13.task4;

import java.util.Optional;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<Integer> integers = Stream.of(5, 4, 34, 28, 56, 22, 9);
        Optional<Integer> firstInteger = integers.filter(integer -> integer > 22)
                .findFirst();
      // а если в коллекции не будет числа > 22? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(firstInteger.get());
    }
}
