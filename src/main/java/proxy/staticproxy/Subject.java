package proxy.staticproxy;

public class Subject implements Client {
    @Override
    public void request() {
        System.out.println("request...");
    }
}
