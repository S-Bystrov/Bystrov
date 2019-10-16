package homework_3.task_2;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int num: array) {
            sum += num;
        }
        double average = (double) sum / array.length;
        System.out.println(average);
// пустая строка не нужа
    }
}
