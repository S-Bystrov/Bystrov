package homewok_2.Task_4;

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
