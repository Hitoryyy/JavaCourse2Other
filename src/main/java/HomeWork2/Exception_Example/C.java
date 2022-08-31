package HomeWork2.Exception_Example;

public class C {
    public static void main(String[] args) {
        try {
            int a = 10;
            a -= 10;
            int b = 42 / a;
            int[] c = {1, 2, 3};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }
        System.out.println("После блока операторов try/catch");
    }
}
