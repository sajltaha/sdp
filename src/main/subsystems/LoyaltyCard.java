package main.subsystems;

// Part of Facade Pattern

public class LoyaltyCard {
    public String customerName;

    public LoyaltyCard(String name) {
        this.customerName = name;
    }

    public void checkStatus() {
        System.out.println("[Card] Reader Check: " + customerName);
        System.out.println("[Card] Status: active");
    }

    public void recordOrder() {
        System.out.println("[Card] Order recorded");
    }
}
