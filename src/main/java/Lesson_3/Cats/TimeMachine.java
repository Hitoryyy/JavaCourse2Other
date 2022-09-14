package Lesson_3.Cats;

public class TimeMachine {

    public void goToFuture(Cat cat) {
        cat.setAge(cat.getAge() + 10);
    }

    public void goToPast(Cat cat) {
        cat.setAge(cat.getAge() - 10);
    }
}
