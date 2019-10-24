package homework_6.task_2;

public class CarMain {
    public static void main(String[] args) {
        Car vehicle = new Car();

        vehicle.startCar();
        vehicle.getTransmission().increaseGear();
        vehicle.getSpeed();
        vehicle.getEngine().start();
        for (int i = 0; i < 8; i++) {
            vehicle.getTransmission().increaseGear();
        }
        vehicle.getSpeed();
    }
}
