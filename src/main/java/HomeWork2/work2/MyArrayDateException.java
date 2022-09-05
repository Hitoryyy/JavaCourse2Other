package HomeWork2.work2;

public class MyArrayDateException extends RuntimeException {

    public MyArrayDateException(String[][] array) {
        super("Не удалось преобразовать массив." + array);
    }
}
