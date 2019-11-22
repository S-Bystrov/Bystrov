package homework_12.task4;

// +
public class Task4 {
    public static void main(String[] args) {
        CreateUser createUser = User::new;
        User user = createUser.create("Sergey");
        System.out.println(user.getName());
    }
}
