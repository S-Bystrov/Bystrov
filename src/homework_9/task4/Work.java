package homework_9.task4;

import java.io.Serializable;

public class Work implements Serializable {
    private String workName;
    private int minWorkExperience;

    public Work(String workName, int minWorkExperience) {
        this.workName = workName;
        this.minWorkExperience = minWorkExperience;
    }

    @Override
    public String toString() {
        return "work='" + workName + '\'' +
                ", minWorkExperience=" + minWorkExperience;
    }
}
