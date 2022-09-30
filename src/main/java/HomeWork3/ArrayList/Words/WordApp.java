package HomeWork3.ArrayList.Words;

import java.util.*;

public class WordApp {

    public static void main(String[] args) {

        Word word = new Word("Book");
        Word word1 = new Word("Cat");
        Word word2 = new Word("Bucket");
        Word word3 = new Word("Cat");
        Word word4 = new Word("Cat");
        Word word5 = new Word("Book");
        Word word6 = new Word("Line");
        Word word7 = new Word("Two");
        Word word8 = new Word("One");
        Word word9 = new Word("View");
        Word word10 = new Word("Paper");

        Word[] words = new Word[]{word, word1, word2, word3, word4,
                word5, word6, word7, word8, word9, word10};

        System.out.println("Array:\n" + Arrays.toString(words));
        System.out.println();

        List<Word> words1 = new ArrayList<Word>(Arrays.asList(words));
        List<Word> words2 = new ArrayList<>();

        System.out.println("ArrayList:\n" + words1);
        System.out.println();

        ListIterator<Word> wordListIterator = words1.listIterator();
        while (wordListIterator.hasNext()) {
            Word word11 = (Word) wordListIterator.next();
            if (!words2.contains(word11)) {
                words2.add(word11);
            }

        }
        System.out.println("No duplicate ArrayList:\n" + words2);


    }
}
