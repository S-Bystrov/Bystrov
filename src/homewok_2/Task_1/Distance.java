package homewok_2.Task_1;

public class Distance {
    public static void main(String[] args) {
        double dist = 10.0;
        int days = 7;
        for (int i=1; i < days; i++){
            dist = dist + dist * 0.1;}
        System.out.println("Суммарный путь спортсмена за " + days + " дней равен " + dist);
    }
}
