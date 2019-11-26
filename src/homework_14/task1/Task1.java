package homework_14.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter language");
        String language = scanner.nextLine();
        // используй шаблон String.format() %s, %d
        String text = "Hello, my name is " + name +
                ". I'm " + language + " developer and I'm glad to become a part of your company.";
        System.out.println(text);
    }
}
