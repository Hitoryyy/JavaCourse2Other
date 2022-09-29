package HomeWork3.ArrayList.Words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListWords {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Word");
        words.add("Cat");
        words.add("Dod");
        words.add("Word");
        words.add("Book");
        words.add("Line");
        words.add("Phone");
        words.add("Tea");
        words.add("Home");
        words.add("Cat");
        words.add("Book");
        words.add("Line");

        int j = 0;
        for (String w : words) {
            j++;
        }
        System.out.println("Все значения: " + words + "\n" + " количество: " + j);
        System.out.println();

        HashSet<String> wordsUnique = new HashSet<>(words);

        int i = 0;
        for (String w : wordsUnique) {
            i++;
        }
        System.out.println("Уникальные значения: " + wordsUnique + "\n" + " колчество: " + i);
    }

}
