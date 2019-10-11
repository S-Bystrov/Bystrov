package homewok_2.task_8;

/*Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел

 */
public class Numbers {
    public static void main(String[] args) {
        int limit = 100;
        int sumEven=0;
        int sumOdd=0;
        /*
        эту задачу оптимально решить через 1 цикл и if-else
        */
        for(int even=0; even<=limit; even++){
            // even = четный и ты проверяешь, нелогично, стоит переименовать
            if(even%2 == 0){
                sumEven += even;}
        }
        System.out.println("Сумма четных чисел от 0 до "+ limit +" равна " + sumEven);
        for(int odd=0; odd<=limit; odd++){
         // odd = нечетный и ты проверяешь, нелогично, стоит переименовать
            if(odd%2 == 1){
                sumOdd += odd;}
        }
        System.out.println("Сумма нечетных чисел от 0 до "+ limit +" равна " + sumOdd);
        int sum = sumEven+sumOdd;
        System.out.println("Сумма всех чисел от 0 до " + limit + " равна " + sum);

    }
}
