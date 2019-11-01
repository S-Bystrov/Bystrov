package homework_8.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        try {
            System.out.println("Enter a number");
            string = scanner.next();
            int num = Integer.valueOf(string);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format: " + string);
        }
    }
}
