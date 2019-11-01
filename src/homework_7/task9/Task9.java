package homework_7.task9;

// +
public class Task9 {
    public static void main(String[] args) {
        int size = 5;
        String[] words = {"car", "second number", "apple"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > size) {
                System.out.println(words[i]);
            }
        }
    }
}
