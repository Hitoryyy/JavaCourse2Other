package HomeWork2.Exception_Example;

public class D {
    public static void main(String[] args) {
//        try {
//            int a  = 0;
//            int b = 42 / a;
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } catch (ArithmeticException e) {   //  ошибка компиляции: недостижимый код !
//            System.out.println("Этот код недостижим");
//        }

        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 " + e);
        } catch (Exception e) {
            System.out.println(e); //   в этом случае код работоспособен
        } finally {
            System.out.println("Continue");
        }
    }
}
