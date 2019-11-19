package homework_12.task7;

import java.util.Map;

public class Sportsman {
    String name;
    double speed;
    Map<String, Award> achievement;

    public Sportsman(String name, double speed, Map<String, Award> achievement) {
        this.name = name;
        this.speed = speed;
        this.achievement = achievement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Map<String, Award> getAchievement() {
        return achievement;
    }

    public void setAchievement(Map<String, Award> achievement) {
        this.achievement = achievement;
    }


    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", achievement=" + achievement +
                '}';
    }
}
