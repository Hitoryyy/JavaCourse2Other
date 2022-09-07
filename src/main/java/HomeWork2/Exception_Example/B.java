package HomeWork2.Exception_Example;

public class B {
    public static void main(String[] args) {
        System.out.println("Начало");
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Конец");
    }
}
