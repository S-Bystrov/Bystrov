package homework_8.task4;

public class WashingMachine {
    public void working() {
        boolean electricity = (int) (Math.random() * 2) % 2 == 0;
        try {
            System.out.println("Washing machine works");
            if (electricity) {
                System.out.println("Washing is over");
            } else {
                throw new ElectricityException("There was a crash! The power went out. Turns on the water drain");
            }  // не понимаю, почему не отрабатывает ошибка, если electricity false
        } catch (ElectricityException e) {
            e.getMessage();
        } finally {
            drainwater();
        }
    }

    private void drainwater() {
        System.out.println("The water is drained");
    }
}
