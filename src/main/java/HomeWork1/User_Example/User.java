package HomeWork1.User_Example;

public class User {
    private int id;
    private String name;
    private String position;
    private int age;

    public User(int id, String name, String position, int age){
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
        System.out.println("ID: " + id + ";\nИмя: " + name + ";\nДолжность: " + position + ";\nВозраст: " + age + ";\n");
    }

    public void changePosition(String position) {
        this.position = position;
        System.out.println("Пользователь: " + name + " получил новую должность: " + position);
    }
}
