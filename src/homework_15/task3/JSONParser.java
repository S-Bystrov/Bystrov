package homework_15.task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework_15.task1.Student;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JSONParser {
    public static final String PATH = "resources/homework15/Students.json";
    public static final String NEW_PATH = "resources/homework15/";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> student = Arrays.asList(mapper.readValue(new File(PATH), Student[].class));
        System.out.println(student);
        List<Student> sortedStudents = student.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(sortedStudents);
        fileWriter(sortedStudents, NEW_PATH);
    }

    // List<E> зачем? просто List<Student>
    private static <E> void fileWriter(List<E> e, String path) throws IOException {
        File listStudent = new File(path, "ListStudents");
        String listStudentPath = listStudent.getAbsolutePath();
        try (FileOutputStream fos = new FileOutputStream(listStudentPath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(e);
            oos.flush();
        }
    }
}
