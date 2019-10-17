package homework_4.task_4;

import homework_4.task_1.Human;

public class Task4 {
    public static void main(String[] args) {
        Human human_1 = new Human("Sergey", 27);
        Human human_2 = new Human();
        Human human_3 = new Human("Svetlana", 28);
        human_1.setText("Peoples");
        human_1.printText();
        human_2.printText();
        human_3.printText();
    }
}
