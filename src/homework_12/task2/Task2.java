package homework_12.task2;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " rubles"; // думаю могут быть проблемы с окончанием, если передать число 1
        System.out.println(convert.apply(5));
    }
}
