package homework_16.task1;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 11 - через конструктор
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }
}
