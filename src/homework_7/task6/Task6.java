package homework_7.task6;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        String[] words = {"Words", "apple", "world"};
        String initialLetter = "W";
        ArrayList<String> outArray = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(initialLetter) || words[i].startsWith(initialLetter.toLowerCase())) {
                    outArray.add(words[i]);
            }
        }
        System.out.println(outArray);
    }
}
