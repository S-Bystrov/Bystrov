package homework_8.task1;

import java.util.Scanner;

// форматируй код
public class Task1 {
    public static void main(String[] args) {
       try{
           Scanner number = new Scanner(System.in);
           System.out.println("Enter two numbers: ");
           int firstNum = number.nextInt();
           int secondNUm = number.nextInt();
           int result = firstNum % secondNUm;
           System.out.println(result);
       } catch (ArithmeticException e) {
           System.out.println("Division by zero is not allowed");
       }
// пустая строка не нужна
    }
}
