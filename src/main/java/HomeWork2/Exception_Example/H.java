package HomeWork2.Exception_Example;

public class H {
    public static void main(String[] args) {
        try {
            int a = 3;
            int b = a / 0;

            int[] arr = new int[] {1, 2, 3};
            arr[3] = 7;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
