package homewok_2.task_5;
/*
Task 5
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
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
