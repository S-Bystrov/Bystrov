package homework_16.task3;

public class Task3 {
    private static ToyStore toyStore;

    public static void main(String[] args) throws InterruptedException {
        toyStore = new ToyStore();

        Thread firstStory = putToy(100);
        Thread secondStory = putToy(50);

        firstStory.start();
        secondStory.start();

        firstStory.join();
        secondStory.join();

        System.out.println("Number of toys: " + toyStore.getNumberOfToys());

    }

    private static Thread putToy(int numberOfToys) {
        Runnable runnable = () -> {
            for (int i = 0; i < numberOfToys; i++) {
                toyStore.putToys();
            }
        };
        return new Thread(runnable);
    }
}
