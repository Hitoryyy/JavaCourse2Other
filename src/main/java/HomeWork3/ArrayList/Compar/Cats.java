package HomeWork3.ArrayList.Compar;

import HomeWork3.ArrayList.ListIter;

import java.util.*;

public class Cats {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>(Arrays.asList(new Cat("A", 5),
                new Cat("B", 2), new Cat("C", 4)));

        System.out.println(cats);
        Collections.sort(cats);
        System.out.println(cats);
    }
}
