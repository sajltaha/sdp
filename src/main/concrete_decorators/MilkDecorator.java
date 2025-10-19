package main.concrete_decorators;
import main.abstract_decorators.BeverageDecorator;
import main.interfaces.IBeverage;

//Part of Decorator Pattern
// One of the concrete decorators - additional add-ons

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(IBeverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }

    public double getPrice() {
        return beverage.getPrice() + 20.0;
    }
}
