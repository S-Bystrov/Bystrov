package homework_14.task7;

public class Man {
    private String name;
    private String surname;
    private Integer phoneNumber;

    // +
    public Man(String name, Integer phoneNumber) {
        init(name, null, phoneNumber);
    }

    public Man(String name, String surname, Integer phoneNumber) {
        init(name, surname, phoneNumber);
    }

    public Man(String name, String surname) {
        init(name, surname, null);
    }

    private void init(String name, String surname, Integer phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
}
