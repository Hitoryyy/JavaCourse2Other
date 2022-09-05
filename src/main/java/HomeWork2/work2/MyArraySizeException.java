package HomeWork2.work2;

import java.util.Arrays;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String[][] array) {
        super("Не верно указан размер массива. Массив должен быть 4х4, вы указали: " + array.length);
    }
}
