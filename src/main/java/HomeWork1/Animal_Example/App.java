package HomeWork1.Animal_Example;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Том", "white");
        Cat cat1 = new Cat("Jery", "чёрный");
        Dog dog = new Dog();


        animal.animalInfo();
        animal.voice();
        cat.animalInfo();
        cat.catInfo();
        cat.jump();
        cat.voice();

        System.out.println();

        cat1.catInfo();
        cat1.voice();

        System.out.println();

        dog.voice();

        Animal animal1 = new Dog();
        if (animal1 instanceof Animal) {
            System.out.println("В animal действительно лежит пёс");
        }
    }
}
