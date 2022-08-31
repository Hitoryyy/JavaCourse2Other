package HomeWork2.Exception_Example;

public class A {
    public static void main(String[] args) {
        int a, b;
        try {
            a = 0;
            b = 10 / a;
            System.out.println("Это сообщение не будет выведено в консоль");
        } catch (ArithmeticException ae) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Завершение работы");
    }
}
