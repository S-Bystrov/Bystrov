package homework_5.task_1;

// я уже объяснил насчет дефолтных методов на занятии, старайся их не использовать
public interface Computer {
    default void turnOn() {
        System.out.println("Turn on the computer");
    }

    default void turnOff() {
        System.out.println("Turn off computer");
    }

    default void reset() {
        System.out.println("Reset");
    }
}
