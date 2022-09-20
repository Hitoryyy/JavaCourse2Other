package HomeWork3.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrApp_1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2, 11);
        System.out.println(list.get(2));
        list.remove(0);

        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);

        System.out.println(Arrays.toString(arr));

    }
}
