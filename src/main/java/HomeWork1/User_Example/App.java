package HomeWork1.User_Example;

public class App {
    public static void main(String[] args) {
        User user = new User(1231, "Artem", "ingener", 31);
        User user1 = new User(142, "Tom", "manager", 33);
        User user2 = new User(1242, "Juli", "biolog", 30);

        User[] users = new User[] {user, user1, user2};

        for (User u: users) {
            u.info();
        }

        user1.changePosition("Директор");

        for (User u: users) {
            u.info();
        }
    }
}
