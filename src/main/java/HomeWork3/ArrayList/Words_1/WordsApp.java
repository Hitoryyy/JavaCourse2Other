package HomeWork3.ArrayList.Words_1;

import java.util.*;

public class WordsApp {

    public static void main(String[] args) {

        String[] arrayApp = new String[]{"Duplicate", "Array", "Font", "Book", "Duplicate",
                "Strong", "Book", "Book", "Cat", "Help"};

        System.out.println("Изначальный массив: \n" + Arrays.toString(arrayApp));
        System.out.println();

        List<String> arrayAppList = new ArrayList<>(Arrays.asList(arrayApp));
        List<String> arrayAppList1 = new ArrayList<>();

        ListIterator<String> arrayListIter = arrayAppList.listIterator();
        while (arrayListIter.hasNext()) {
            String str = arrayListIter.next();
            if (!arrayAppList1.contains(str)) {
                arrayAppList1.add(str);
            }
        }

        System.out.println("Массив без дубликатов: \n" + arrayAppList1);
        System.out.println();

        Map<Integer, String> mapDuplicate = new HashMap<>();
        int indexKeyDuplicate = 0;
        int countDuplicate = 0;

        for (String valueDuplicate : arrayApp) {
            indexKeyDuplicate++;
            mapDuplicate.put(indexKeyDuplicate, valueDuplicate);
        }
        System.out.println(mapDuplicate);


    }

}
