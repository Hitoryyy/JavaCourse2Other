package HomeWork1.Animal_Example;

public class Cat extends Animal {
    private String color;
    private int age;

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

    public int getAge() {
        return age;
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

    @Override
    public String toString() {
        return "Cat: " + getName();
    }

    @Override
    public int hashCode() {
        return getName().hashCode() + age * 71;
    }

    @Override
    public boolean equals(Object obj) {
        if  (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cat another = (Cat) obj;
        return this.age == another.age && this.getName().equals(another.getName());
    }
}
