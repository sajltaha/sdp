package main.beverages;
import main.interfaces.IBeverage;

//Part of Decorator Pattern
// One of the simple basic beverages

public class Coffee implements IBeverage {
    private final String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Coffee: " + name;
    }

    public double getPrice() {
        return 100.0;
    }
}
