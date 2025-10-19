package main.subsystems;

// Part of Facade Pattern

public class PaymentCounter {
    public void processPayment(double amount) {
        System.out.println("[Cashier] Payment: " + amount + " $");
        System.out.println("[Cashier] Payment successful");
    }
}
