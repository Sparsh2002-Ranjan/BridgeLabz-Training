public class CreateObject {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
    }
}