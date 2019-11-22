package homework_12.task5;

import homework_12.task4.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

// +
public class Task5 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Sergey"));
        userList.add(new User("Alex"));
        userList.add(new User("Pavel"));
        userList.add(new User("Egor"));
        userList.add(new User("Ivan"));

        Predicate<String> predicate = name -> name.startsWith("A") || name.startsWith("E") || name.startsWith("P");
        filterList(userList, predicate);
        System.out.println(userList);


    }

    private static void filterList(List<User> userList, Predicate<String> predicate) {
        userList.removeIf(user -> predicate.test(user.getName()));
    }
}
