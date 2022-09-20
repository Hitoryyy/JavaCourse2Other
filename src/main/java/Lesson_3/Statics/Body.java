package Lesson_3.Statics;

public class Body {

    public static void calculateMassIndex(double weight, double height) {
        double indexMass = weight / (height * height);

        if (indexMass < 18.5) {
            System.out.println("Недовес: меньше 18.5");
        } else if (indexMass >= 18.5 && indexMass < 25) {
            System.out.println("Нормальный: между 18.5 и 25");
        } else if (indexMass >= 25 && indexMass < 30) {
            System.out.println("Избыточный: между 25 и 30");
        } else if (indexMass >= 30) {
            System.out.println("Ожирение: 30 или больше");
        }
    }

}
