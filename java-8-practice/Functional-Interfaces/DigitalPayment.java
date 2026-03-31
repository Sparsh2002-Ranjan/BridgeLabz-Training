interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {}
}

class CreditCard implements Payment {
    public void pay(double amount) {}
}

class Wallet implements Payment {
    public void pay(double amount) {}
}

public class DigitalPayment {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        card.pay(1000);
        wallet.pay(300);
    }
}
