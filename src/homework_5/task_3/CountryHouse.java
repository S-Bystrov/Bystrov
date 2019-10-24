package homework_5.task_3;

import java.util.Scanner;

public class CountryHouse implements House {
    private int numOfFloor;
    private int numOfTenants;
    private String turnOnOrOffHeating;

    public CountryHouse(int numOfFloor, int numOfTenants, String turnOnOrOffHeating) {
        this.numOfFloor = numOfFloor;
        this.numOfTenants = numOfTenants;
        this.turnOnOrOffHeating = turnOnOrOffHeating;
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
        System.out.println("Country house. Number of floors: " + numOfFloor + ". Number of tenants: " + numOfTenants +
                ". " + turnOnOrOffHeating);
    }
}
