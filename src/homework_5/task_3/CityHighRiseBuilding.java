package homework_5.task_3;

// +
public class CityHighRiseBuilding extends HouseAbs {

    public CityHighRiseBuilding() {
    }

    public CityHighRiseBuilding(int numOfFloor, int numOfTenants, String turnOnOrOffHeating) {
        super(numOfFloor, numOfTenants, turnOnOrOffHeating);
        type = "City high-rise building";
    }
}
