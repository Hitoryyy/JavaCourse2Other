package Lesson_1;

public class Guard {

    boolean canPass(User user) {
        return user.getAgeBefore18() == 0;
    }
}