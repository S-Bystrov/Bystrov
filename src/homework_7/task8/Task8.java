package homework_7.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] carsType = {"1.4", "2.2", "1.6", "1.8"};
        String firstTypeForChange = "1.4";
        String secondTypeForChange = "1.8";
        String replacement = "2.0";
        String adding = "T";
        for (int i = 0; i < carsType.length; i++) {
            if (carsType[i] == firstTypeForChange) { // carsType[i].equals(firstTypeForChange) и только так
                carsType[i] = carsType[i].replace(firstTypeForChange, replacement);
            }
            if (carsType[i] == secondTypeForChange) { // carsType[i].equals(firstTypeForChange) и только так
                carsType[i] = carsType[i].concat(adding);
            }
        }
        System.out.println(Arrays.toString(carsType));
    }
}
