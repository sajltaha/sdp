package main.concrete_decorators;
import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

// Part of Decorator Pattern

public class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + " with chocolate";
    }

    public double getPrice() {
        return beverage.getPrice() + 25.0;
    }
}
