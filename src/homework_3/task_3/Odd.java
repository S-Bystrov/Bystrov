package homework_3.task_3;

import java.util.Arrays;

// форматируй код
public class Odd {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i<array.length; i++) {
            if(array[i]%2!=0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
