package Lesson_3.Statics;

/*
Класс ConsoleReader
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Scanner;

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        return d;
    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean b = scanner.nextBoolean();
        return b;
    }

    public static String read() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        return str;
    }

    public static void main(String[] args) {
        try {
            read();
            readString();
            readInt();
            readDouble();
            readBoolean();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
