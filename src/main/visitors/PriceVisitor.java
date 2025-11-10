package main.visitors;

import main.composit.Menu;
import main.concrete_ingredients.Egg;
import main.concrete_ingredients.Pancake;
import main.concrete_ingredients.Syrup;
import main.interfaces.IVisitor;

public class PriceVisitor implements IVisitor {
    private double totalPrice = 0;

    @Override public void visitPancake(Pancake p) { totalPrice += p.getPrice(); }
    @Override public void visitSyrup(Syrup s) { totalPrice += s.getPrice(); }
    @Override public void visitEgg(Egg e) { totalPrice += e.getPrice(); }
    @Override public void visitMenu(Menu m) {
        System.out.println("Calculating price for: " + m.getName());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
