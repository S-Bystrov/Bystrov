package homework_5.task_1;

// Task1 -> Laptop, например
public class Task1 implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }

    @Override
    public void reset() {
        System.out.println("The reset is made");
    }
}
