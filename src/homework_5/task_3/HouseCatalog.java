package homework_5.task_3;

public class HouseCatalog {
    public static void main(String[] args) {
        CountryHouse countryHouse = new CountryHouse(1, 5, "heating is off");
        CityHighRiseBuilding cityHighRiseBuilding = new CityHighRiseBuilding(4, 56, "heating turned on");
        // House[] houseCatalog = {cityHighRiseBuilding, countryHouse}; - можно так
        final House[] houseCatalog = new House[]{cityHighRiseBuilding, countryHouse};
        for (House house : houseCatalog) {
            house.show();
        }
    }
}
