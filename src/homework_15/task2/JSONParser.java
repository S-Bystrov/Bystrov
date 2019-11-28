package homework_15.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework_15.task1.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JSONParser {
    public static final String PATH = "resources/homework15/Students.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> student = Arrays.asList(mapper.readValue(new File(PATH), Student[].class));
        System.out.println(student);
    }
}
