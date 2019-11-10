package homework_9.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// +
public class EmployeeReadMain {
    private static final String FILE_REFERENCE = "src/homework_9/task4/Employee";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(FILE_REFERENCE);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        }
    }
}
