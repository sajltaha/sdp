package main.abstract_decorators;

//Part of Decorator Pattern
// Abstract decorator

import main.interfaces.IBeverage;

public abstract class BeverageDecorator implements IBeverage {
    protected IBeverage beverage;
    public BeverageDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription();
    }
    public double getPrice() {
        return beverage.getPrice();
    }
}
