package main.adapters;

import main.gateways.StripeGateway;
import main.interfaces.IPaymentProcessor;

public class StripeAdapter implements IPaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.charge(amount);
    }
}