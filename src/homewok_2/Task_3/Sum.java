package homewok_2.Task_3;

public class Sum {
    public static void main(String[] args) {
        int sum = 1;
        int i = 2;
        for(; i<257; i = i*2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
