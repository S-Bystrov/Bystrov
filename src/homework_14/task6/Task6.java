package homework_14.task6;


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arrayOne = {1, 4, 6};
        int[] arrayTwo = {0, 2, 3, 5};
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        int i = arrayOne.length - 1, j = arrayTwo.length - 1, k = newArray.length;
        while (k > 0)
            // строку ниже лучше разбить на что-то более понятное
            newArray[--k] = (j < 0 || (i >= 0 && arrayOne[i] >= arrayTwo[j])) ? arrayOne[i--] : arrayTwo[j--];
        System.out.println(Arrays.toString(newArray));
    }
}
