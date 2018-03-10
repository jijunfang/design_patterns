package proxy.staticproxy;

public class StaticProxy implements Client{

    private Subject subject;

    public StaticProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("before...");
        subject.request();
    }
}
