package homework_16.task3;

public class ToyStore {
    private int numberOfToys;

    public synchronized void putToys() {
        numberOfToys++;
    }

    public int getNumberOfToys() {
        return numberOfToys;
    }
}
