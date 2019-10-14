package homework_3.task_2;

public class Average {
    public static void main(String[] args) {
        int[] array = {4, 2, 2};
        int sum = 0;
        for (int num: array) {
            sum = sum + num;
        }
        int average = sum / array.length;
        System.out.println(average);

    }
}
