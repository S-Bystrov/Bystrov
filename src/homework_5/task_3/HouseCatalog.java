package homework_5.task_3;

public class HouseCatalog {
    public static void main(String[] args) {
        CountryHouse countryHouse = new CountryHouse(1, 5, "heating is off");
        CityHighRiseBuilding cityHighRiseBuilding = new CityHighRiseBuilding(4, 56, "heating turned on");
        final House[] houseCatalog = new House[2];
        houseCatalog[0] = cityHighRiseBuilding;
        houseCatalog[1] = countryHouse;
        houseCatalog[0].show();
        houseCatalog[1].show();
    }

}
