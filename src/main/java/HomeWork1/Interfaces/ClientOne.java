package HomeWork1.Interfaces;

public class ClientOne implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("ClientOne param: " + param);
    }
}
