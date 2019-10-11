package homework_3.task_2;

public class Average {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 6, 10};
        int average;
        int sum = 0;
        for (int num: array) {
            sum = sum + num;
        }
        average = sum / array.length;
        System.out.println(average);

    }
}
