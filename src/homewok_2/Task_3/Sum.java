package homewok_2.Task_3;
/*
Task 3
Вычислить: 1+2+4+8+...+256
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 1;
        int i = 2;
        for(; i<=256; i = i*2) {
            sum = sum + i;
        }
        System.out.println("Сумма равняется " + sum);
    }
}
