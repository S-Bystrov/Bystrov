package homework_9.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// +
public class EmployeeMain {
    private static final String DIRECTORY = "src/homework_9/task4";

    public static void main(String[] args) throws IOException {
        File employeeFile = new File(DIRECTORY, "Employee");
        String employeeFilePath = employeeFile.getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(employeeFilePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Employee employee = new Employee("Sergey", 27, new Work("master", 4));
            oos.writeObject(employee);
            oos.flush();
        }
    }
}
