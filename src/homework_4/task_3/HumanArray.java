package homework_4.task_3;

import homework_4.task_1.Human;

public class HumanArray {
    public static void main(String[] args) {
        Human[] human = new Human[7];
        human[0] = new Human("Sergey", 27);
        human[1] = new Human("Alexandr", 4);
        human[2] = new Human("Svetlana", 28);
        human[3] = new Human("Sergey", 27);
        human[4] = new Human("Svetlana", 28);
        human[5] = new Human("Pavel", 26);
        human[6] = new Human("Sergey", 27);
        int count = 0;
        for (int i = 1; i < human.length; i++) {
            if (human[0].equals(human[i])) {
                count++;
            }
        }
        System.out.println("Одинаковых объектов в массиве: " + count);
    }
}
