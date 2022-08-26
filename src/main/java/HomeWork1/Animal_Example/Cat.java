package HomeWork1.Animal_Example;

public class Cat extends Animal {
    private String color;

//    public Cat(String name, String color) {
//        this.setName(name);
//        this.color = color;
//    }

    public Cat() {

    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Кот: " + super.getName() + " цвет: " + color);
    }

    @Override
    public void jump() {
        System.out.println("Кот подпрыгнул");
    }

    @Override
    void voice() {
        System.out.println("Кот мяукнул");
    }
}
