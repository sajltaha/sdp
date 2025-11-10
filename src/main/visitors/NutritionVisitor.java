package main.visitors;

import main.composit.Menu;
import main.concrete_ingredients.Egg;
import main.concrete_ingredients.Pancake;
import main.concrete_ingredients.Syrup;
import main.interfaces.IVisitor;

public class NutritionVisitor implements IVisitor {
    private double totalCalories = 0;

    @Override public void visitPancake(Pancake p) { totalCalories += p.getCalories(); }
    @Override public void visitSyrup(Syrup s) { totalCalories += s.getCalories(); }
    @Override public void visitEgg(Egg e) { totalCalories += e.getCalories(); }
    @Override public void visitMenu(Menu m) {
        System.out.println("Calculating calories for: " + m.getName());
    }

    public double getTotalCalories() {
        return totalCalories;
    }
}
