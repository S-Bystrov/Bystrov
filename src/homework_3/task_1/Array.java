package homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

// форматируй код
public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            // Scanner scanner = new Scanner(System.in); - один раз за пределами цикла, затем просто вызывай метод nextInt()
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите элемент массива:");
            int element = scanner.nextInt();
            array[i] = element;
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        // за 1 проход по массиву можно найти сумму, мин и макс. пока не оптимально
        for (int num: array) {
            sum += num;
        }
        System.out.println("Сумма всех чисел равна: " + sum);

        int max = 0;
        int min = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>array[max]){
                max = i;
            }
            else if(array[i]<array[min]){
                min = i;
            }
        }
        System.out.println("Наибольшее число: " + array[max] + " Наименьшее число: " + array[min]);
    }
}
