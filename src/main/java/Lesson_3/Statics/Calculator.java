package Lesson_3.Statics;

/*
Класс Calculator
 */

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int difference = a - b;
        return difference;
    }

    public static int multiply(int a, int b) {
        int multiplication = a * b;
        return multiplication;
    }

    public static double division(int a, int b) {
        double div = (double) a / (double) b;
        return div;
    }

    public static double percent(int a, int b) {
        double perc = ((double) a / 100) * (double) b;
        return perc;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        System.out.println(plus(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiply(a, b));
        System.out.println(division(a, b));
        System.out.println(percent(100, 25));
    }
}
