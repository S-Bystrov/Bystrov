package homewok_2.Task_6;
/*
Task 6
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class EvenNumbers {
    public static void main(String[] args) {
        int limit = 100;
        int result;
        for(int i=1; i<=limit; i++){
            result = i%2;
            if(result == 0){
                System.out.println(i);
            }
        }

    }
}
