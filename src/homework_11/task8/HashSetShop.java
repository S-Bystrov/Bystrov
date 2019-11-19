package homework_11.task8;

import java.util.HashSet;

// +
public class HashSetShop {
    public static void main(String[] args) {
        HashSet<Shop> shopHashSet = new HashSet<>();
        Shop shop1 = new Shop(123, "Prostore");
        Shop shop2 = new Shop(123, "Prostore");
        Shop shop3 = new Shop(123, "Prostore");
        Shop shop4 = new Shop(123, "Prostore");
        shopHashSet.add(shop1);
        shopHashSet.add(shop2);
        shopHashSet.add(shop3);
        shopHashSet.add(shop4);
        System.out.println(shopHashSet);
    }
}
