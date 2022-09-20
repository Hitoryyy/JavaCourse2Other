package Lesson_3.Statics;

/*
Класс StringHelper
*/

public class StringHelper {

    public static String multiply(String text) {
        String result = "";
        int count = 5;
        while (count > 0) {
            result = result + text;
            count--;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";

        while (count > 0) {
            result = result + text;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(StringHelper.multiply("Cat"));
        System.out.println();
        System.out.println();
        System.out.print(StringHelper.multiply("Cat", 10));
    }
}
