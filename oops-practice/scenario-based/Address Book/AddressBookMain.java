import java.util.*;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        System.out.println("Enter Address Book Name:");
        String bookName = sc.nextLine();
        AddressBook book = system.addAddressBook(bookName);

        while (true) {
            System.out.println("\n--- ADDRESS BOOK MENU ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Count by City / State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                System.out.println("Enter First Name:");
                String firstName = sc.nextLine();

                System.out.println("Enter Last Name:");
                String lastName = sc.nextLine();

                System.out.println("Enter Address:");
                String address = sc.nextLine();

                System.out.println("Enter City:");
                String city = sc.nextLine();

                System.out.println("Enter State:");
                String state = sc.nextLine();

                System.out.println("Enter Zip:");
                String zip = sc.nextLine();

                System.out.println("Enter Phone:");
                String phone = sc.nextLine();

                System.out.println("Enter Email:");
                String email = sc.nextLine();

                ContactPerson p = new ContactPerson(
                        firstName, lastName, address,
                        city, state, zip, phone, email
                );

                System.out.println(
                        book.addContact(p)
                                ? "Contact Added Successfully"
                                : "User Already Exists"
                );
            }

            else if (choice == 2) {
                System.out.println("Enter Full Name to Edit (FirstName LastName):");
                String fullName = sc.nextLine();

                System.out.println("Enter New Address:");
                System.out.println("Address:");
                System.out.println("City:");
                System.out.println("State:");
                System.out.println("Zip:");
                System.out.println("Phone:");
                System.out.println("Email:");

                System.out.println(
                        book.editContact(fullName, sc)
                                ? "Contact Updated Successfully"
                                : "User Not Found"
                );
            }

            else if (choice == 3) {
                System.out.println("Enter Full Name to Delete (FirstName LastName):");
                String fullName = sc.nextLine();

                System.out.println(
                        book.deleteContact(fullName)
                                ? "Contact Deleted Successfully"
                                : "User Not Found"
                );
            }

            else if (choice == 4) {
                Map<String, List<ContactPerson>> cityMap = new HashMap<>();
                Map<String, List<ContactPerson>> stateMap = new HashMap<>();

                for (AddressBook b : system.getAllBooks()) {
                    for (ContactPerson p : b.getContacts()) {
                        cityMap.computeIfAbsent(p.city, k -> new ArrayList<>()).add(p);
                        stateMap.computeIfAbsent(p.state, k -> new ArrayList<>()).add(p);
                    }
                }

                System.out.println("Enter City or State name:");
                String key = sc.nextLine();

                if (cityMap.containsKey(key))
                    System.out.println("Contacts in City: " + cityMap.get(key).size());

                if (stateMap.containsKey(key))
                    System.out.println("Contacts in State: " + stateMap.get(key).size());

                if (!cityMap.containsKey(key) && !stateMap.containsKey(key))
                    System.out.println("No Records Found");
            }

            else if (choice == 5) {
                book.displayAllContacts();
            }


            else if (choice == 6) {
                System.out.println("Exiting Address Book");
                break;
            }

            else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
