package homework_7.task2;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("alucard");
        System.out.println(word);
        // просто word.reverse(); Класс StringBuilder изменяемый, в отличие от String
        word = word.reverse();
        System.out.println(word);
    }
}
