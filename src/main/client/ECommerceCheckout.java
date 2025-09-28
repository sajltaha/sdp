package main.client;

import main.interfaces.IPaymentProcessor;

public class ECommerceCheckout {
    private IPaymentProcessor paymentProcessor;

    public void setPaymentProcessor(IPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        if (paymentProcessor != null) {
            paymentProcessor.processPayment(amount);
        } else {
            System.out.println("Please select a payment method.");
        }
    }
}