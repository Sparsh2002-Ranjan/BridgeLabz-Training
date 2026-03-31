import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default format: " + DateUtil.formatDate(today, "yyyy-MM-dd"));
        System.out.println("Custom format: " + DateUtil.formatDate(today, "dd/MM/yyyy"));
        System.out.println("Long format: " + DateUtil.formatDate(today, "EEEE, MMMM d, yyyy"));
    }
}
