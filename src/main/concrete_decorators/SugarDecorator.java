package main.concrete_decorators;
import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

// Part of Decorator Pattern

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + " with sugar";
    }

    public double getPrice() {
        return beverage.getPrice() + 10.0;
    }
}
