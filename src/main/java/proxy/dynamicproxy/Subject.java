package proxy.dynamicproxy;

public class Subject implements Client {
    @Override
    public void request() {
        System.out.println("request...");
    }
}
