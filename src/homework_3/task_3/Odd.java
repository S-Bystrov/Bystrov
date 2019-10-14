package homework_3.task_3;

import java.util.Arrays;

public class Odd {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 7};
        for (int i = 0; i<array.length; i++) {
            if(array[i]%2!=0){
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
