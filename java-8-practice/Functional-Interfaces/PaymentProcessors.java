interface PaymentProcessor {
    void process(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}

class CardPayment implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing card payment: " + amount);
    }
}

class UpiPayment implements PaymentProcessor {
    public void process(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}

public class PaymentProcessors {
    public static void main(String[] args) {
        PaymentProcessor card = new CardPayment();
        PaymentProcessor upi = new UpiPayment();

        card.process(1000);
        upi.process(500);

        card.refund(200);
        upi.refund(100);
    }
}
