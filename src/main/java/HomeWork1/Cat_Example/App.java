package HomeWork1.Cat_Example;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "белый", 4, 4);
        Cat cat1 = new Cat("Мурзик", "чёрный", 2,4);
        Cat cat2 = new Cat("Барсик", "серый", 3,5);
        Cat cat3 = new Cat();

        Cat[] cats = new Cat[]{cat, cat1, cat2, cat3};

        for (Cat c : cats) {
            c.info();
        }

//        Cat cat3 = new Cat("Крушила", "В яблоко", 3);
//
//        Cat[] cats = new Cat[4];
//
//        for (int i = 0; i < cats.length; i++) {
//            cat.putMeInArray(cats, i);
//        }
//
//        for (Cat c : cats) {
//            c.info();
//        }

        //cat3.putMeInArray(cats, 2);
        cat.feed(3);

        System.out.println();

        int i = 10;
        int j = 7;
        System.out.println(Cat.sumCat(i, j));
    }
}
