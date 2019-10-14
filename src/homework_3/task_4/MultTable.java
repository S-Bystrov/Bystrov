package homework_3.task_4;

public class MultTable {
    public static void main(String[] args) {
        int dimension = 10;
        int[][] array = new int[dimension][dimension];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[j][i] = (i + 1) * (j + 1);
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
