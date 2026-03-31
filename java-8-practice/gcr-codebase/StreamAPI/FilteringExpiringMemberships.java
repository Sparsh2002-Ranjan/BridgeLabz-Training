
import java.time.*;
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }

    public LocalDate getExpiry() { return expiry; }
    public String toString() { return name; }
}

public class FilteringExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = List.of(
            new Member("Aman", LocalDate.now().plusDays(10)),
            new Member("Riya", LocalDate.now().plusDays(40))
        );

        members.stream()
               .filter(m -> m.getExpiry().isBefore(LocalDate.now().plusDays(30)))
               .forEach(System.out::println);
    }
}
