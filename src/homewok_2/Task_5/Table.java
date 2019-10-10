package homewok_2.Task_5;

public class Table {
    public static void main(String[] args) {
        int inch = 20;
        float cm = 2.54f;
        for(int i=1; i<=inch; i++){
            float result = i * cm;
            System.out.println( i + " дюймов равняется " + result + " см");

        }

    }
}
