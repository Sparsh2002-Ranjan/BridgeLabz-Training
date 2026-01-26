import java.util.*;

public class AddressBookSystem {
    Map<String, AddressBook> addressBooks = new HashMap<>();

    public AddressBook addAddressBook(String name) {
        AddressBook book = new AddressBook(name);
        addressBooks.put(name, book);
        return book;
    }

    public Collection<AddressBook> getAllBooks() {
        return addressBooks.values();
    }
}
