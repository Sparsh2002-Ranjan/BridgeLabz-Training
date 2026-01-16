import java.lang.reflect.*;

public class ExecutionTimer {
    public static void main(String[] args) throws Exception {
        Method m = MathOperations.class.getMethod("multiply", int.class, int.class);
        MathOperations mo = new MathOperations();
        long s = System.nanoTime();
        m.invoke(mo, 5, 6);
        long e = System.nanoTime();
        System.out.println(e - s);
    }
}