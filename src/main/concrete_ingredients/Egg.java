package main.concrete_ingredients;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

public class Egg implements IIngredient {
    @Override public String getName() { return "Egg"; }
    @Override public double getCalories() { return 70; }
    @Override public double getPrice() { return 0.8; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitEgg(this);
    }
}
