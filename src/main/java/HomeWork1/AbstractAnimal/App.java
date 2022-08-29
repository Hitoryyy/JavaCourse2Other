package HomeWork1.AbstractAnimal;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        cat.jump();

        Animal a = new Cat();

        if (a instanceof Cat) {
            System.out.println(true);
        }

        System.out.println(cat);

        System.out.println();

        Cat cat1 = new Cat("Tom",3);
        System.out.println(cat1);
    }
}
