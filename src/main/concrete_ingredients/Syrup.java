package main.concrete_ingredients;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

public class Syrup implements IIngredient {
    @Override public String getName() { return "Syrup"; }
    @Override public float getCalories() { return 200; }
    @Override public float getPrice() { return 1.0F; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitSyrup(this);
    }
}
