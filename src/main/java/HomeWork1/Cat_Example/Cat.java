package HomeWork1.Cat_Example;

public class Cat {
    private String name;
    private String color;
    private int age;
    private int weight;

    public Cat() {
    }

    public Cat(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Некоректный возраст!");
            return;
        }
        this.age = age;
    }

    public void info() {
        System.out.println("Кот: " + name + ";\nцвет: " + color + ";\nвозраст: " + age + ";\n");
    }

    public void putMeInArray(Cat[] cats, int arrayIndex) {
        cats[arrayIndex] = this;
    }

    public int feed(int food) {
        weight = weight + food;
        System.out.println("Вес кота " + name + " после кормёжки: " + weight);
        return weight;
    }
}
