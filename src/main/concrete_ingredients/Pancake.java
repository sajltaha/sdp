package main.concrete_ingredients;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

public class Pancake implements IIngredient {
    @Override public String getName() { return "Pancake"; }
    @Override public float getCalories() { return 300; }
    @Override public float getPrice() { return 2.5F; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitPancake(this);
    }
}
