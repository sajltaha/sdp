package main.subsystems;

// Part of Facade Pattern

public class NotificationSystem {
    public void sendReceipt(String customerName, String beverageDesc) {
        System.out.println("[Notifications] Email sent to customer");
        System.out.println("[Notifications] Receipt for: " + beverageDesc);
    }
}
