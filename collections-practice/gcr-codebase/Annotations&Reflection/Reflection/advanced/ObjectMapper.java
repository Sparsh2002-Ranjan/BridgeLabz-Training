import java.lang.reflect.*;
import java.util.*;

public class ObjectMapper {
    public static <T> T toObject(Class<T> cls, Map<String,Object> map) throws Exception {
        T obj = cls.getDeclaredConstructor().newInstance();
        for (Map.Entry<String,Object> e : map.entrySet()) {
            Field f = cls.getDeclaredField(e.getKey());
            f.setAccessible(true);
            f.set(obj, e.getValue());
        }
        return obj;
    }
}