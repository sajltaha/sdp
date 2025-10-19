package main.subsystems;

//Part of Facade Pattern
// One of the complex cafe subsystems

public class Menu {
    public void searchBeverage(String desc) {
        System.out.println("[Menu] Search for beverage: " + desc);
        System.out.println("[Menu] Beverage available");
    }
}
