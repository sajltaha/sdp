package main.concrete_decorators;

//Part of Decorator Pattern
// One of the concrete decorators - additional add-ons

import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

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
