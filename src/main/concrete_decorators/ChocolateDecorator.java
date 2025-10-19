package main.concrete_decorators;

//Part of Decorator Pattern
// One of the concrete decorators - additional add-ons

import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

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
