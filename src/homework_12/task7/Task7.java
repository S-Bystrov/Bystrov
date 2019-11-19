package homework_12.task7;

import java.util.ArrayList;
import java.util.List;

// +
public class Task7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("world");
        strings.add("peace");
        strings.add("java");
        strings.sort((a, b) -> b.compareTo(a));
        System.out.println(strings);
    }
}
