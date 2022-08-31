package HomeWork2.work2;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String[][] array) {
        super("Не верно указан размер массива. Массив должен быть 4х4." + array);
    }
}
