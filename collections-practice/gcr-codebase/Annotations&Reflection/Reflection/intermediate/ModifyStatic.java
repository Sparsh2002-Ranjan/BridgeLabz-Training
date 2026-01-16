import java.lang.reflect.*;

public class ModifyStatic {
    public static void main(String[] args) throws Exception {
        Field f = Configuration.class.getDeclaredField("API_KEY");
        f.setAccessible(true);
        f.set(null, "NEW_KEY");
        System.out.println(f.get(null));
    }
}