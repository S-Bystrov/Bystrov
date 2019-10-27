package homework_6.task_2;

public class Engine {
// пустая строка не нужна
    private boolean working;

    public void start() {
        if (working) {
            System.out.println("The engine is already started");
        } else {
            working = true;
        }
// пустая строка не нужна
    }

    public void stop() {
        if (working) {
            working = false;
        } else {
            System.out.println("The engine is already stopped");
        }
    }

    public boolean isWorking() {
        return working;
    }

}
