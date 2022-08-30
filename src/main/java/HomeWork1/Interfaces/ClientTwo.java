package HomeWork1.Interfaces;

public class ClientTwo implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("ClientTwo param: " + param);
    }
}
