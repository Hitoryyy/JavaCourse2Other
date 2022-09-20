package Lesson_3.Cats;

public class App {

    public static void main(String[] args) {
        TimeMachine timeMachine = new TimeMachine();
        Cat cat = new Cat(5);

        System.out.println("Сколько лет коту в самом начале работы программы?");
        System.out.println(cat.getAge());

        timeMachine.goToFuture(cat);
        System.out.println("А теперь?");
        System.out.println(cat.getAge());

        System.out.println("Ёлки палки! Кот постарел на 10 лет! Живо гони назад!");
        timeMachine.goToPast(cat);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(cat.getAge());
    }
}
