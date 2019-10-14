package homewok_2.task_3;
/*
Task 3
Вычислить: 1+2+4+8+...+256
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 1;
        // for(int i = 2; i<=256; i = i*2) { - лучше так
        for(int i = 2; i<=256; i = i*2) {
            sum = sum + i;
        }
        System.out.println("Сумма равняется " + sum);
    }
}
