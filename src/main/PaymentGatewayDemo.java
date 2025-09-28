package main;

import main.adapters.PayPalAdapter;
import main.adapters.StripeAdapter;
import main.client.ECommerceCheckout;
import main.gateways.PayPalGateway;
import main.gateways.StripeGateway;

public class PaymentGatewayDemo {

    public static void main(String[] args) {
        ECommerceCheckout checkout = new ECommerceCheckout();

        PayPalGateway payPalGateway = new PayPalGateway();
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalGateway);

        checkout.setPaymentProcessor(payPalAdapter);
        System.out.println("Attempting to pay $150.50 using PayPal...");
        checkout.checkout(150.50);

        System.out.println("----------------------------------------");

        StripeGateway stripeGateway = new StripeGateway();
        StripeAdapter stripeAdapter = new StripeAdapter(stripeGateway);

        checkout.setPaymentProcessor(stripeAdapter);
        System.out.println("Attempting to pay $89.99 using Stripe...");
        checkout.checkout(89.99);
    }
}