package homework_11.task9;

import java.util.TreeSet;

// +
public class TreeSetStudent {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Sergey", 27));
        students.add(new Student("Alex", 24));
        students.add(new Student("Denis", 25));
        students.add(new Student("Alina", 21));
        System.out.println(students);
    }
}
