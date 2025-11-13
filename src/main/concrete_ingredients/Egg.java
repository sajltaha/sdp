package main.concrete_ingredients;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

public class Egg implements IIngredient {
    @Override public String getName() { return "Egg"; }
    @Override public float getCalories() { return 70; }
    @Override public float getPrice() { return 0.8F; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitEgg(this);
    }
}
