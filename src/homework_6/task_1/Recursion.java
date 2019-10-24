package homework_6.task_1;


import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = scanner.nextInt();
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        recursElements(0);
    }

    private static void recursElements(int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            recursElements(index + 1);
        }
    }
}
