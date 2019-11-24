package homework13.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// +
public class Task1 {
    public static void main(String[] args) {
        List<String> stringArray = new ArrayList<>();
        stringArray.add("Java");
        stringArray.add("multiplication");
        stringArray.add("apple");
        stringArray.add("i");
        System.out.println(stringArray);

        List<String> filerStringArray = stringArray.stream()
                .filter(string -> string.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(filerStringArray);
    }
}
