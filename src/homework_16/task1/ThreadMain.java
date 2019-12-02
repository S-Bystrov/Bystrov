package homework_16.task1;

public class ThreadMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("My Thread");
        myThread.start();
    }
}
