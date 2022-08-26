package HomeWork1.Animal_Example;

public class Animal {
    private String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + this.name);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }

    void voice() {
        System.out.println("Животное издало какой-то звук");
    }
}
