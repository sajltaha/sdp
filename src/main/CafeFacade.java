package main;

//Part of Facade Pattern
// Cafe facade

import main.interfaces.IBeverage;
import main.subsystems.LoyaltyCard;
import main.subsystems.Menu;
import main.subsystems.NotificationSystem;
import main.subsystems.PaymentCounter;

public class CafeFacade {
    private final Menu menu;
    private final LoyaltyCard card;
    private final PaymentCounter payment;
    private final NotificationSystem notification;
    public CafeFacade(String customerName) {
        this.menu = new Menu();
        this.card = new LoyaltyCard(customerName);
        this.payment = new PaymentCounter();
        this.notification = new NotificationSystem();
    }
    public void orderBeverage(IBeverage beverage, String size) {
        System.out.println("\n========== Order ==========");
        System.out.println("Beverage: " + beverage.getDescription());
        System.out.println("Size: " + size);
        System.out.println("======================================\n");
        menu.searchBeverage(beverage.getDescription());
        card.checkStatus();
        payment.processPayment(beverage.getPrice());
        card.recordOrder();
        notification.sendReceipt(card.customerName, beverage.getDescription());
        System.out.println("\n✓ Order placed! Enjoy your drink!\n");
    }
}
