package homework13.task5;

import java.util.Optional;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> integers = Stream.of(5, 4, 34, 28, 56, 22, 9);
        Optional<Integer> multiplication = integers.limit(5).reduce((x, y) -> x * y);
         // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(multiplication.get());
    }
}
