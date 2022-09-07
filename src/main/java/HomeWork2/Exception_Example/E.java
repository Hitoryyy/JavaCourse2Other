package HomeWork2.Exception_Example;

public class E {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("NPE Test");
        } catch (NullPointerException e) {
            System.out.println("Catch block");
        }
    }
}
