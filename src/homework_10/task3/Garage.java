package homework_10.task3;

public class Garage<C extends Car> {
    private C[] cars;

    public Garage(C[] cars) {
        this.cars = cars;
    }

    public static void main(String[] args) {
        Garage<BMW> garageBMW = new Garage<>(new BMW[]{new BMW()});
        Garage<Lada> garageLada = new Garage<>(new Lada[]{new Lada()});
        Garage<Car> garageCars = new Garage<>(new Car[]{new Lada(), new BMW()});

    }
}
