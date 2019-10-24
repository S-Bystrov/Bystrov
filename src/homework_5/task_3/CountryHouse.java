package homework_5.task_3;


public class CountryHouse extends HouseAbs {

    public CountryHouse() {
    }

    public CountryHouse(int numOfFloor, int numOfTenants, String turnOnOrOffHeating) {
        super(numOfFloor, numOfTenants, turnOnOrOffHeating);
        type = "Country house";
    }
}
