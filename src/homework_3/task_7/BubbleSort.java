package homework_3.task_7;

import java.util.Arrays;

// format code
public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayBubble = new int[10];
        for (int i = 0; i < arrayBubble.length; i++) {
            arrayBubble[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayBubble));

        // sort -> needToSort
        boolean sort = true;

        while (sort) {
            sort = false;

            for (int i = 1; i <arrayBubble.length ; i++) {
                if(arrayBubble[i] < arrayBubble[i-1]){
                    swap(arrayBubble, i, i-1);
                    sort = true;
                }
            }
        }
        System.out.println(Arrays.toString(arrayBubble));
    } // между методами необходим абзац
    private static void swap(int[] array, int previous, int current){
        int var = array[current];
        array[current] = array[previous];
        array[previous] = var;
// пустая строка не нужа
    }
}
