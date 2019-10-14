package homewok_2.task_4;
/*
Task 4
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Multiplication {
    public static void main(String[] args) {
        // a, b - плохие названия переменных
        int firstNum = 5;
        int secondNum = 10;
        int multiplication = firstNum;
        for (int i = 1; i<secondNum; i++) {
            multiplication = multiplication + firstNum;
        }
        System.out.println(" A * B = " + multiplication);
    }
}
