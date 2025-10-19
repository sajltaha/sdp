package main.concrete_decorators;
import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

// Part of Decorator Pattern

public class WhippedCreamDecorator extends BeverageDecorator {
    public WhippedCreamDecorator(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + " with whipped cream";
    }

    public double getPrice() {
        return beverage.getPrice() + 30.0;
    }
}
