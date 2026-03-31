import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = s -> s.length();

        String message1 = "Hello";
        String message2 = "This is a long message";

        System.out.println("Length of message1: " + lengthChecker.apply(message1));
        System.out.println("Length of message2: " + lengthChecker.apply(message2));
    }
}
