package HomeWork2.Exception_Example;

public class G {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        try {
            delE(x, y);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }


    }

    public static int delE(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
