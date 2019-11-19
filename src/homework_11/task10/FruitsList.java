package homework_11.task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitsList {
    public static void main(String[] args) {
        List<Fruit> allFruits = new ArrayList<>();
        allFruits.add(new Fruit("apple", 12));
        allFruits.add(new Fruit("pear", 2.3));
        allFruits.add(new Fruit("apple", 14.3));
        allFruits.add(new Fruit("plum", 9.3));
        allFruits.add(new Fruit("pear", 15));
        Map<String, Double> warehouse = new HashMap<>();
        for (Fruit fruit : allFruits) {
            if (warehouse.containsKey(fruit.getName())) {
                // сумму лучше вынести в переменную, так код будет читабельнее
                warehouse.put(fruit.getName(), warehouse.get(fruit.getName()) + fruit.getWeight());
            } else {
                warehouse.put(fruit.getName(), fruit.getWeight());
            }
        }
        System.out.println(warehouse);
    }
}
