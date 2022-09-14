package Lesson_3.Jarv;

public class App {

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        Jarvis jarvis1 = new Jarvis();
        jarvis.sayHi("Артём");
        jarvis.sayHi("Artem", "Hitory");
        Jarvis jarvis2 = new Jarvis();
        jarvis2.sayHi("Attem", "Tony Stark", "Captain America", "Hulk", "Black Widow");
    }
}
