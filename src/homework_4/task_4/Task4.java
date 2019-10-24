package homework_4.task_4;

import homework_4.task_1.Human;

public class Task4 {
    public static void main(String[] args) {
         // sergey -> sergey
        Human sergey = new Human("Sergey", 27);
        // noName -> noName
        Human noName = new Human();
        // svetlana -> svetlana
        Human svetlana = new Human("Svetlana", 28);
        sergey.setText("Peoples");
        sergey.printText();
        noName.printText();
        svetlana.printText();
    }
}
