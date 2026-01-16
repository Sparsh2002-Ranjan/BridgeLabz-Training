import java.lang.reflect.*;

public class ImportantDemo {

    @ImportantMethod
    public void task1() {}

    @ImportantMethod(level="LOW")
    public void task2() {}

    public static void main(String[] args) {
        for (Method m : ImportantDemo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName() + " " + im.level());
            }
        }
    }
}