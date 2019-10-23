package homework_5.task_3;

public class CityHighRiseBuilding implements House {
    private int numOfFloor;
    private int numOfTenants;
    private String turnOnOrOffHeating;

    public CityHighRiseBuilding(int numOfFloor, int numOfTenants){
        this.numOfFloor = numOfFloor;
        this.numOfTenants = numOfTenants;
    }

    @Override
    public int getNumOfFloor() {
        return numOfFloor;
    }

    @Override
    public int getNumOfTenants() {
        return numOfTenants;
    }

    @Override
    public String getTurnOnOrOffHeating() {
        return turnOnOrOffHeating;
    }

    @Override
    public void show() {
        System.out.println("Number of floors: " + numOfFloor + "Number of tenants: " + numOfTenants +
                "Heating " + turnOnOrOffHeating);
    }
}
