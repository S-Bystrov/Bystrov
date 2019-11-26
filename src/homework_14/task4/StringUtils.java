package homework_14.task4;

import java.io.*;
import java.util.HashSet;


public class StringUtils {
    private static final String PATH = "src/homework_14/task4/Text.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(searchForPalindromes(PATH));
    }

    private static HashSet<String> searchForPalindromes(String FilePath) throws IOException {
        File text = new File(FilePath);
        HashSet<String> palindromes = new HashSet<>();
        try (FileReader readerText = new FileReader(PATH);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;

            while ((line = bReaderText.readLine()) != null) {
                for (String str : line.toLowerCase().split("\\p{Punct}*\\s")) {
                    for (int i = 0; i < str.length() / 2; i++) {
                        if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                            palindromes.add(str);
                        }
                    } // очень большая вложенность кода, стоит разбить на методы
                }
            }
        }
        return palindromes;
    }
}
