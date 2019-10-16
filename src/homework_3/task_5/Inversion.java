package homework_3.task_5;

import java.util.Arrays;

public class Inversion {
    public static void main(String[] args) {
        int tempVar; // создавай переменную максимально близко к месту, в котором будешь использовать
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        int numOfChanges = array.length / 2;

        for (int i = 0; i < numOfChanges; i++) {
            tempVar = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempVar;
        }
        System.out.println(Arrays.toString(array));
    }

}
