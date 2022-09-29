package HomeWork3.ArrayList.Words;

import java.util.*;

public class HashMapWords {

    public static void main(String[] args) {

        Map<Integer, String> words = new HashMap<>();
        words.put(1, "Book");
        words.put(2, "Cat");
        words.put(3, "London");
        words.put(4, "Mouse");
        words.put(5, "Book");
        words.put(6, "Password");
        words.put(7, "Man");
        words.put(8, "Password");
        words.put(9, "Bronze");
        words.put(10, "Cat");

        System.out.println("Список слов:");
        for (Map.Entry<Integer, String> o : words.entrySet()) {
            System.out.print(o.getValue() + " ");
        }
        System.out.println();

        int countWords = 0;
        HashSet<String> hashSetWords = new HashSet<>();
        for (Map.Entry<Integer, String> o : words.entrySet()) {
            if (o.getValue() == o.getValue()) {
                countWords++;
                hashSetWords.add(o.getValue());
            }
        }
        System.out.println(hashSetWords + "\n" + "Количество повотряющихся слов: " + countWords);

    }

}
