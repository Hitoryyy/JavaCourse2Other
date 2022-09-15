package Lesson_3.StrP;

/*
    Сравнение строк в JAVA
 */

public class Main {

    public static void main(String[] args) {

        /*--------------------- ==  --------------------------------------------*/
        String s1 = "Java - лучший язык программирования!";
        String s2 = "Java - лучший язык программирования!";
        String s3 = new String("Java - лучший язык программирования!");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3 || s2 == s3);

        /*----------------------------- equals()    -----------------------------*/

        String s4 = "Java - лучший язык программирования!";
        String s5 = "Java - лучший язык программирования!";
        String s6 = "JAVA - ЛУЧШИЙ ЯЗЫК ПРОГРАММИРОВАНИЯ!";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6) || s5.equals(s6));
        System.out.println();

        /*----------------------    equalsIgnoreCase    ------------------------*/
        String s7 = "216501, Смоленская обл., г. Рославль";
        String s8 = "216501, СМОЛЕНСКАЯ ОБЛ., Г. РОСЛАВЛЬ";

        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
        /*---------------------------------------------------------------------*/

        System.out.println();
        System.out.println("intern() :");

        /*----------------------    intern()    -------------------------------*/
        String s9 = "Java";
        String s10 = new String("Java");
        System.out.println(s9 == s10.intern());
        /*---------------------------------------------------------------------*/
    }
}
