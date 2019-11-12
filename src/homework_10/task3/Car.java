package homework_10.task3;

public abstract class Car {
    private String type;
    private double engineVolume;
    private int maxSpeed;
    private String color;

    Car() {
    }

    Car(String type, double engineVolume, int maxSpeed, String color) {
        this.type = type;
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
