package homework_5.task_1;

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
