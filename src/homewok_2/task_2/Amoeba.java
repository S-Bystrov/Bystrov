package homewok_2.task_2;
/*
Task 2
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Amoeba {
    public static void main(String[] args) {
        int amoeb = 1;
        int hour = 0;
        int totalHours = 24;
        int period = 3;
//         for (int hour = 0; hour < totalHours; hour += period) { - лучше так
        for (; hour < totalHours; hour += period) {
            amoeb *= 2;
            System.out.println(amoeb);
        }
    }
}
