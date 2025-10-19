package main.abstract_decorators;
import main.interfaces.IBeverage;

//Part of Decorator Pattern
// Abstract decorator

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
