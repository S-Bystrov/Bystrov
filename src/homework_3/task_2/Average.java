package homework_3.task_2;

public class Average {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 6, 13};
        double average;
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = sum + array[i];
        }
        average = sum / array.length;
        System.out.println(average);

    }
}
