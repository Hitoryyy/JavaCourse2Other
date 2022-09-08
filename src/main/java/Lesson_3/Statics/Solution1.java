package Lesson_3.Statics;

/*
Затенение поля класса
 */

public class Solution1 {
    public static int salary;

    public static void add(int increase) {
        Solution1.salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
