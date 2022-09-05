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

        arr = new String[][]{{"2", "4", "5", "2"}, {"2", "4", "7", "1"}, {"6", "4", "1", "9"}, {"6", "73", "12", "3"}};

        createDoArray(arr);
        parseStringToInt(arr);
    }


    static String[][] createDoArray(String[][] array) throws MyArraySizeException {

        if (array.length < 4 || array.length > 4) {
            throw new MyArraySizeException(array);
        }

        for (String[] a : array) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println();

        return array;
    }

    static String[][] parseStringToInt(String[][] array) throws MyArrayDateException {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDateException(array);
                }
            }
        }
        for (String[] a : array) {
            System.out.println(Arrays.toString(a));
        }

        return array;
    }
}
