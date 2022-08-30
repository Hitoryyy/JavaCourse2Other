package HomeWork1.Enums;

public class App {
    public static void main(String[] args) {
//       Fruit fruit = Fruit.APPLE;
//       Fruit fruit1 = Fruit.BANANA;
//        System.out.println(fruit);
//
//        if (fruit == Fruit.APPLE) {
//            System.out.println("fruit действительно является яблоком");
//        }
//
//        switch (fruit) {
//            case APPLE:
//                System.out.println("fruit - яблоко");
//                break;
//            case BANANA:
//                System.out.println("fruit - банан");
//                break;
//            case CHERRY:
//                System.out.println("fruit - вишня");
//                break;
//        }

        System.out.println("Все элементы перечисления:");

        for (Fruit fruit : Fruit.values()) {
            System.out.println(fruit);
        }
        System.out.println("Поиск по названию: " + Fruit.valueOf("BANANA"));
    }
}
