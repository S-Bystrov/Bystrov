package homewok_2.task_4;
/*
Task 4
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Multiplication {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int multiplication = a;
        for (int i = 1; i<b; i++) {
            multiplication = multiplication + a;
        }
        System.out.println(" A * B = " + multiplication);


    }
}
