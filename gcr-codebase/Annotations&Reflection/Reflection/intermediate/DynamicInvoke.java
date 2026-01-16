import java.lang.reflect.*;

public class DynamicInvoke {
    public static void main(String[] args) throws Exception {
        MathOperations mo = new MathOperations();
        Method m = MathOperations.class.getMethod("add", int.class, int.class);
        System.out.println(m.invoke(mo, 10, 5));
    }
}