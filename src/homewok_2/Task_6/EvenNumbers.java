package homewok_2.Task_6;

public class EvenNumbers {
    public static void main(String[] args) {
        int even = 100;
        float result;
        for(int i=1; i<=even; i++){
            result = i%2;
            if(result == 0){
                System.out.println(i);
            }
        }

    }
}
