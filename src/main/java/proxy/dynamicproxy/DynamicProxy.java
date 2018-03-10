package proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before...");
        return method.invoke(target, args);
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }
}
