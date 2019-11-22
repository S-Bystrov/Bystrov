package homework_12.task3;

import java.util.function.BinaryOperator;

// +
public class Task3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplication = (x, y) -> x * y;
        System.out.println(multiplication.apply(14, 2));
    }
}
