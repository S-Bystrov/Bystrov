package homework_11.task1;

import java.util.*;

public class Checklist {
    public static void main(String[] args) {
        ArrayList<String> checklist = new ArrayList<>();
        checklist.add("Anton Petrov");
        checklist.add("Irina Smolova");
        checklist.add("Ivan Bystrov");
        checklist.add("Alina Sokolova");
        System.out.println(checklist);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String namePersonForSearch = scanner.next();
        System.out.println("Enter your surname");
        String surnamePersonForSearch = scanner.next();
        String nameForSearch = namePersonForSearch + " " + surnamePersonForSearch;
        if (checklist.contains(nameForSearch)) {
            System.out.println("Entry allowed");
        } else {
            System.out.println("No entry allowed");
        }


    }
}
