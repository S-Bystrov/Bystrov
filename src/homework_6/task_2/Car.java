package homework_6.task_2;

public class Car {
    private boolean hitGas;
    private Engine engine;
    private Transmission transmission;
    private boolean carMovement;

    // Engine, Transmission аргументами в конструктор
    public Car() {
        engine = new Engine();
        transmission = new Transmission();
    }

    public void startCar() {
        if (!engine.isWorking()) {
            engine.start();
            transmission.setGear(1);
            hitGas = true;
            carMovement = true;
        }
    }

    // getSpeed - 'get' метод должен что-то возврашать, а не быть void, печатать скорость можешь в методе мейн
    public void getSpeed() {
        if (carMovement) {
            System.out.println("Car speed: " + 20 * transmission.getGear());
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

}
