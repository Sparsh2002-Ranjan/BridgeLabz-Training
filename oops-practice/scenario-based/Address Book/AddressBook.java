import java.util.*;

public class AddressBook {
    String name;
    List<ContactPerson> contacts = new ArrayList<>();
    Set<String> nameSet = new HashSet<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public boolean addContact(ContactPerson person) {
        String fullName = person.getFullName();

        if (nameSet.contains(fullName)) {
            return false;
        }

        contacts.add(person);
        nameSet.add(fullName);
        return true;
    }

    public boolean editContact(String fullName, Scanner sc) {
        for (ContactPerson p : contacts) {
            if (p.getFullName().equalsIgnoreCase(fullName)) {
                p.address = sc.nextLine();
                p.city = sc.nextLine();
                p.state = sc.nextLine();
                p.zip = sc.nextLine();
                p.phone = sc.nextLine();
                p.email = sc.nextLine();
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String fullName) {
        Iterator<ContactPerson> it = contacts.iterator();
        while (it.hasNext()) {
            ContactPerson p = it.next();
            if (p.getFullName().equalsIgnoreCase(fullName)) {
                it.remove();
                nameSet.remove(p.getFullName());
                return true;
            }
        }
        return false;
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }

    public void displayAllContacts() {
    if (contacts.isEmpty()) {
        System.out.println("No Contacts Found");
        return;
    }
    int len=1;
    for (ContactPerson p : contacts) {
        System.out.println("contact "+len++);
        System.out.println("Name   : " + p.getFullName());
        System.out.println("Address: " + p.address);
        System.out.println("City   : " + p.city);
        System.out.println("State  : " + p.state);
        System.out.println("Zip    : " + p.zip);
        System.out.println("Phone  : " + p.phone);
        System.out.println("Email  : " + p.email);
    }
}

}
