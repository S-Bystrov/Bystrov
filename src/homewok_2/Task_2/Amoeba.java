package homewok_2.Task_2;

public class Amoeba {
    public static void main(String[] args) {
        int amoeb = 1;
        int hour = 0;
        for (; hour < 24; hour = hour + 3) {
            amoeb = amoeb*2;
            System.out.println(amoeb);
        }
    }
}
