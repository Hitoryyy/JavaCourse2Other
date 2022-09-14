package Lesson_3.Jarv;

public class Jarvis {

    public void sayHi(String firstGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", как ваши дела?");
    }

    public void sayHi(String firstGuest, String secondGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }

    // что-бы не делать постоянные перегрузки метода
    public void sayHi(String...names){
        for (String name : names) {
            System.out.println("Добрый вечер " + name + ", как выши дела?");
        }
    }
}
