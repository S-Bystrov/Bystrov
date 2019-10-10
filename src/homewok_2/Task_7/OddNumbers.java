package homewok_2.Task_7;

public class OddNumbers {
    public static void main(String[] args) {
        int limit = 100;

        int sum = 0;
        for(int odd=1; odd<=limit; odd++){
            if( odd%2 == 1){
                sum += odd;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до "+ limit +" равна " + sum);
    }
}


