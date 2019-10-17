package homework_4.task_1;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private static String text = "Hello from static";

    public Human() {
        this("NoData", 0);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void show() {
        System.out.println("Name: " + getName() + "; age: " + getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setText(String text) {
        Human.text = text;
    }

    public void printText() {
        System.out.println(text);
    }
}
