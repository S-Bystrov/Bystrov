package homewok_2.task_7;
/*
Task 7
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class OddNumbers {
    public static void main(String[] args) {
        int limit = 100;
        int sum = 0;
        for(int odd=1; odd<=limit; odd++){
            // у тебя переменная называется odd = нечетный и при этом ты проверяешь ее на нечетность, нелогично, стоит переименовать
            if( odd%2 == 1){
                sum += odd;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до "+ limit +" равна " + sum);
    }
}


