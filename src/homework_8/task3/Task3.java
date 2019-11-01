package homework_8.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int maxLength = 9;
        Scanner scanner = new Scanner(System.in);
        try {
            int length;
            System.out.println("Enter the length of array (no more then " + maxLength + ")");
            length = scanner.nextInt();
            int[] newArray = new int[length];
            if (length > 9 || length < 0) {
                throw new MyException("The number entered is greater than the allowed limit. Enter a new number");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
