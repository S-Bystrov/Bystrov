package homewok_2.Task_1;
/*
Task 1
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
 */
public class Distance {
    public static void main(String[] args) {
        double dist = 10.0;
        int days = 7;
        for (int i=1; i < days; i++){
            dist = dist + dist * 0.1;}
        System.out.println("Суммарный путь спортсмена за " + days + " дней равен " + dist);
    }
}
