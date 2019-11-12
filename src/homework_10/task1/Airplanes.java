package homework_10.task1;

public class Airplanes<T, S> {
    private T type;
    private S maxSpeed;
    private String countryOfProduction;

    public <W> Airplanes(T type, S maxSpeed, W countryOfProduction) {
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.countryOfProduction = countryOfProduction.toString();
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public S getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(S maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    private static <E> E showElement(E elem) {
        elem.getClass().getName();
        return elem;
    }



}
