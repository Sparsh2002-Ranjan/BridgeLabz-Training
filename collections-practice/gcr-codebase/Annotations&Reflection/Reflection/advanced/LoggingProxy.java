import java.lang.reflect.*;

public class LoggingProxy {
    public static void main(String[] args) {
        Greeting g = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            (obj, method, params) -> {
                System.out.println("Calling: " + method.getName());
                return method.invoke(new GreetingImpl(), params);
            }
        );
        g.sayHello();
    }
}