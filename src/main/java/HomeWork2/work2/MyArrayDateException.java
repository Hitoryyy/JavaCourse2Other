package HomeWork2.work2;

import java.util.Arrays;

public class MyArrayDateException extends RuntimeException {

    public MyArrayDateException(String[][] array) {
        super("Не удалось преобразовать строковый массив в целочисленный массив, невозможно преобразовать следующие элементы: ");
    }
}
