import java.util.*;

class Bank {
    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}

class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account acc : accounts) {
            System.out.println(name + " - " + acc.getBank().getBankName()
                    + " Balance: " + acc.getBalance());
        }
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

public class ATM {
    public static void main(String[] args) {
        Bank hdfc = new Bank("HDFC");
        Bank sbi = new Bank("SBI");

        Customer c1 = new Customer("Aman");
        Customer c2 = new Customer("Ram");

        hdfc.openAccount(c1, 200);
        sbi.openAccount(c1, 270);
        hdfc.openAccount(c2, 250);

        c1.viewBalance();
        c2.viewBalance();
    }
}
