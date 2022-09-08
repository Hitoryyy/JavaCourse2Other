package Lesson_3.Statics;

/*
Расстояние между двумя точками
 */

public class Util {

//    public static double getDistance(int x1, int y1, int x2, int y2) {
//        double Distance = Math.sqrt((Math.sqrt(x2 - x1)) + Math.sqrt(y2 - y1));
//        return Distance;
//    }

    public static double getDistance(int x1, int y1, int x2, int y2) {

        int dx = x2 - x1;
        int dy = y2 - y1;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    public static void main(String[] args) {
//        System.out.println(getDistance(2,7, 5,9));
        System.out.println(getDistance(6,2,7,1));
    }
}
