package HomeWork1.Interfaces;

public class Client implements Callback {

    public void callback(int param) {
        System.out.println("param: " + param);
    }

    public void info() {
        System.out.println("Client info");
    }
}
