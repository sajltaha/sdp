package main.concrete_ingredients;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

public class Pancake implements IIngredient {
    @Override public String getName() { return "Pancake"; }
    @Override public double getCalories() { return 300; }
    @Override public double getPrice() { return 2.5; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitPancake(this);
    }
}
