package HomeWork3.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIter {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("B")) {
//                iterator.remove();
                iterator.set("F");
            }
        }
        System.out.println(list);
    }
}
