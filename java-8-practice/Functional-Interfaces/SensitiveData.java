interface Sensitive {
}

class Account implements Sensitive {
    String accountNumber;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

public class SensitiveData {
    public static void main(String[] args) {
        Account acc = new Account("12345");

        if (acc instanceof Sensitive) {
            System.out.println("Account " + acc.accountNumber + " is marked as sensitive.");
        } else {
            System.out.println("Account " + acc.accountNumber + " is NOT sensitive.");
        }
    }
}
