package HomeWork2.work2;

import java.util.Arrays;

public class MyExc {
    public static void main(String[] args) {

//        String[][] arr = new String[4][4];

//        arr[0][0] = "2";
//        arr[0][1] = "34";
//        arr[0][2] = "7";
//        arr[0][3] = "667";
//
//        arr[1][0] = "113";
//        arr[1][1] = "5";
//        arr[1][2] = "33";
//        arr[1][3] = "4";
//
//        arr[2][0] = "12";
//        arr[2][1] = "1";
//        arr[2][2] = "111";
//        arr[2][3] = "44";
//
//        arr[3][0] = "12";
//        arr[3][1] = "99";
//        arr[3][2] = "3";
//        arr[3][3] = "7";

        String arr[][];

        arr = new String[][]{{"2", "4", "5", "2"}, {"2", "4", "7", "1"},
                             {"6", "4", "1", "e9"}, {"6", "3", "12", "3"}};

        createDoArray(arr);

        System.out.println();

    }

    static String[][] createDoArray(String[][] array) throws MyArraySizeException, MyArrayDateException {

        if (array.length < 4 || array.length > 4) {
            throw new MyArraySizeException(array);
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                   summ += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDateException(array);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма всех элементов массива равна: " + summ);
        return array;
    }
}
