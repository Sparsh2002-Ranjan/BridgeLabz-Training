import java.lang.reflect.*;

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);
        System.out.println(m.invoke(c, 4, 5));
    }
}