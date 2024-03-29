package homework_16.task2;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 21 через конструктор
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1); // метод sleep() принимает время в миллисекундах, получается поток у тебя спит 1 миллисекунду, а надо секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
