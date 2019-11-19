package homework_11.task11;

import java.util.TreeSet;

public class NameTreeSet {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Sergey");
        name.add("Howard");
        name.add("Alina");
        name.add("Boris");
        name.add("Tom");
        name.add("Victor");
        name.add("Oleg");
        name.add("Ivan");
        System.out.println(name);
        System.out.println(name.subSet("H", "W"));
        // name.subSet("H", "W") - в этот сабсет не войдут имена на W, но есть метод subSet() с 4мя аргументами
    }
}
