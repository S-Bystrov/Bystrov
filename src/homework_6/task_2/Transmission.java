package homework_6.task_2;

public class Transmission {

    private int gear;

    public int increaseGear() {
        if (gear < 7) {
            gear++;
        } else {
            System.out.println("It is impossible to increase the gear");
        }
        return gear;
    }

    public int decreaseGear() {
        if (gear > 0) {
            gear--;
        } else {
            System.out.println("It is impossible to decrease the gear");
        }
        return gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
