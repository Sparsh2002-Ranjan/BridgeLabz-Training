import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Person");
        for (Method m : cls.getDeclaredMethods()) System.out.println(m);
        for (Field f : cls.getDeclaredFields()) System.out.println(f);
        for (Constructor<?> c : cls.getDeclaredConstructors()) System.out.println(c);
    }
}