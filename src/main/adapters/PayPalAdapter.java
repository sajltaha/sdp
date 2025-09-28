package main.adapters;

import main.gateways.PayPalGateway;
import main.interfaces.IPaymentProcessor;

public class PayPalAdapter implements IPaymentProcessor {
    private final PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}