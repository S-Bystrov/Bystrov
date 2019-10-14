package homework_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scOne = new Scanner(System.in);
        System.out.println("Введите первый элемент массива: ");
        int iOne = scOne.nextInt();

        Scanner scTwo = new Scanner(System.in);
        System.out.println("Введите второй элемент массива: ");
        int iTwo = scTwo.nextInt();

        Scanner scThree = new Scanner(System.in);
        System.out.println("Введите третий элемент массива: ");
        int iThree = scThree.nextInt();

        array[0] = iOne;
        array[1] = iTwo;
        array[2] = iThree;
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int num: array) {
            sum = sum + num;
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
