package HomeWork2.work2;

public class MyExc {
    public static void main(String[] args) {

        String[][] arr = new String[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + '\t');
            }
            System.out.println();
        }

        createDoArray(arr);
    }

    static String[][] createDoArray(String[][] array) throws MyArraySizeException {

        if (array.length < 4 || array.length > 4) {
            throw new MyArraySizeException(array);
        }

        return array;
    }
}
