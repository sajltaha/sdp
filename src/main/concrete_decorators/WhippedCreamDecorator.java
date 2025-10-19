package main.concrete_decorators;

//Part of Decorator Pattern
// One of the concrete decorators - additional add-ons

import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

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
