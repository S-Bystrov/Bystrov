package homework_3.task_6;

import java.util.Arrays;

public class EvenArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        int lengthOfNewArray = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                lengthOfNewArray++;
            }

        }
        int[] evenArray = new int[lengthOfNewArray];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0){
                evenArray[index] = num;
                index++;
            }

        }
        System.out.println(Arrays.toString(evenArray));
    }
}

