package main;
import main.beverages.Coffee;
import main.beverages.Tea;
import main.concrete_decorators.ChocolateDecorator;
import main.concrete_decorators.MilkDecorator;
import main.concrete_decorators.SugarDecorator;
import main.concrete_decorators.WhippedCreamDecorator;
import main.interfaces.IBeverage;

public class CafeApp {
    public static void main(String[] args) {
        CafeFacade cafe = new CafeFacade("John Doe");

        // Order 1: A simple coffee
        IBeverage bev1 = new Coffee("Espresso");
        cafe.orderBeverage(bev1, "Small");

        // Order 2: A tea with milk and sugar
        IBeverage bev2 = new Tea("Green Tea");
        bev2 = new MilkDecorator(new SugarDecorator(bev2));
        cafe.orderBeverage(bev2, "Medium");

        // Order 3: A coffee with whipped cream and chocolate
        IBeverage bev3 = new Coffee("Latte");
        bev3 = new WhippedCreamDecorator(new ChocolateDecorator(bev3));
        cafe.orderBeverage(bev3, "Large");

        // Order 4: Full-Add-On Tea
        IBeverage bev4 = new Tea("Black Tea");
        bev4 = new MilkDecorator(new SugarDecorator(new WhippedCreamDecorator(new ChocolateDecorator(bev4))));
        cafe.orderBeverage(bev4, "Extra Large");
    }
}