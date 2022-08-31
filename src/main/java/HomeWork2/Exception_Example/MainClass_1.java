package HomeWork2.Exception_Example;

public class MainClass_1 {
    public static void justMethod() {
        int a = 0;
        int b = 10 / a;
    }
    public static void main(String[] args) {
        justMethod(); // ошибка укажет на 8-ю строку кода, где производится вызов метода из 4-й строки с ошибкой
    }
}
