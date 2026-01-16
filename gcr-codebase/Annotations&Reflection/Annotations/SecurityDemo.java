import java.lang.reflect.*;

public class SecurityDemo {

    static String currentRole = "USER";

    @RoleAllowed("ADMIN")
    public void adminTask() {}

    public static void main(String[] args) throws Exception {
        SecurityDemo sd = new SecurityDemo();
        Method m = sd.getClass().getMethod("adminTask");
        RoleAllowed ra = m.getAnnotation(RoleAllowed.class);
        if (ra.value().equals(currentRole)) {
            m.invoke(sd);
        } else {
            System.out.println("Access Denied!");
        }
    }
}