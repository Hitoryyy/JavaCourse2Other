package HomeWork3.ArrayList;

import HomeWork2.Exception_Example.E;

import java.util.*;

public class ArrApp {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add(1, "AO");
        System.out.println(arrayList);
        arrayList.remove("E");
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
