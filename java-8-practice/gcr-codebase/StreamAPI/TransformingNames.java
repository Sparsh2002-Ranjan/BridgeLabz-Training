
import java.util.*;
import java.util.stream.*;

public class TransformingNames {
    public static void main(String[] args) {
        List<String> names = List.of("rahul", "anita", "vikas");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
