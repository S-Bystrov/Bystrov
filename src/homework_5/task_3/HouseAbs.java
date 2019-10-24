package homework_5.task_3;

public abstract class HouseAbs implements House {

    private int numOfFloor;
    private int numOfTenants;
    private String turnOnOrOffHeating;
    // private или procted, default не оставляй
    String type;

    HouseAbs() {
    }

    HouseAbs(int numOfFloor, int numOfTenants, String turnOnOrOffHeating) {
        this.numOfFloor = numOfFloor;
        this.numOfTenants = numOfTenants;
        this.turnOnOrOffHeating = turnOnOrOffHeating;
    }

    public int getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(int numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    public int getNumOfTenants() {
        return numOfTenants;
    }

    public void setNumOfTenants(int numOfTenants) {
        this.numOfTenants = numOfTenants;
    }

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

    // мы уже познакомились с методом toString() используй его для вывода на экран
    @Override
    public void show() {
        System.out.println(type + ". Number of floors: " + numOfFloor + ". Number of tenants: " + numOfTenants +
                ". " + turnOnOrOffHeating);
    }
}
