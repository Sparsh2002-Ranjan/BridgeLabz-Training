
import java.util.*;

class Invoice {
    int id;
    Invoice(int id) {
        this.id = id;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> ids = List.of(1, 2, 3);
        ids.stream().map(Invoice::new).forEach(i -> System.out.println(i.id));
    }
}
