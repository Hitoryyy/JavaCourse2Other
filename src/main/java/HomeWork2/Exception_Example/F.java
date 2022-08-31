package HomeWork2.Exception_Example;

import java.io.IOException;
import java.io.PrintWriter;

public class F {
    public static void main(String[] args) {
        try {
            createReport();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createReport() throws IOException, RuntimeException {
        PrintWriter pw = new PrintWriter("report.txt");
        pw.close();
    }
}
