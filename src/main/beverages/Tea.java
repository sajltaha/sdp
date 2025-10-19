package main.beverages;
import main.interfaces.IBeverage;

// Part of Decorator Pattern

public class Tea implements IBeverage {
    private final String name;

    public Tea(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Tea: " + name;
    }

    public double getPrice() {
        return 80.0;
    }
}
