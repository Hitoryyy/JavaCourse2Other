package Lesson_3;

public class Maiin {

    public static void main(String[] args) {

        int x = 7;
        incrementNumber(x);
        System.out.println(x);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println(cat.getAge());
    }

    public static void incrementNumber(int x) {
        x++;
    }

    public static void catLevelUp(Cat cat) {
        cat.setAge(cat.getAge() + 1);
    }
}
