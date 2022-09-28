package HomeWork3.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("C");
        list.add("B");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("A")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
