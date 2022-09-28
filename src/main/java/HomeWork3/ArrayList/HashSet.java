package HomeWork3.ArrayList;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        set.add("Альфа");
        set.add("Бетта");
        set.add("Альфа");
        set.add("Эта");
        set.add("Гамма");
        set.add("Эпсилон");
        set.add("Омега");
        set.add("Гамма");
        System.out.println(set);
    }
}
