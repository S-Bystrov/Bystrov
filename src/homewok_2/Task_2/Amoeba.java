package homewok_2.Task_2;

public class Amoeba {
    public static void main(String[] args) {
        int amoeb = 1;
        int hour = 0;
        int totalHours = 24;
        int period = 3;
        for (; hour < totalHours; hour += period) {
            amoeb *= 2;
            System.out.println(amoeb);
        }
    }
}
