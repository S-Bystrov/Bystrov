package homework_6.task_2;

public class Engine {
    private boolean working;

    public void start() {
        if (working) {
            System.out.println("The engine is already started");
        } else {
            working = true;
        }

    }

    public void stop() {
        if (working) {
            working = false;
        } else {
            System.out.println("The engine is already stopped");
        }
    }

}
