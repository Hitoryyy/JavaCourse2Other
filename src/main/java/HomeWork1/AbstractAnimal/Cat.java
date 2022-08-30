package HomeWork1.AbstractAnimal;

public class Cat extends Animal {

    private String name;
    private int age;

    final int MONTHS_COUNT = 12; // final в объявлении поля или переменной

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукнул");
    }

    @Override
    public void jump() {
        System.out.println("Кот подпрыгнул");
    }

    @Override
    public String toString() {
        return "Cat: " + getName() + " " +getAge();
    }

    public final void run() { // final в объявлении метода - метод нельзя переопределить

    }
}
