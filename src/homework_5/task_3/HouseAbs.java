package homework_5.task_3;

public abstract class HouseAbs implements House {

    protected int numOfFloor;
    protected int numOfTenants;
    protected String turnOnOrOffHeating;
    protected String type;


    public HouseAbs(int numOfFloor, int numOfTenants, String turnOnOrOffHeating) {
        this.numOfFloor = numOfFloor;
        this.numOfTenants = numOfTenants;
        this.turnOnOrOffHeating = turnOnOrOffHeating;
    }

    public HouseAbs() {
    }

    @Override
    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    @Override
    public int getNumOfTenants() {
        return numOfTenants;
    }

    public void setNumOfTenants(int numOfTenants) {
        this.numOfTenants = numOfTenants;
    }

    @Override
    public String getTurnOnOrOffHeating() {
        return turnOnOrOffHeating;
    }

    public void setTurnOnOrOffHeating(String turnOnOrOffHeating) {
        this.turnOnOrOffHeating = turnOnOrOffHeating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void show() {
        System.out.println(type + ". Number of floors: " + numOfFloor + ". Number of tenants: " + numOfTenants +
                ". " + turnOnOrOffHeating);
    }
}
