package main.interfaces;

import main.composit.Menu;
import main.concrete_ingredients.Egg;
import main.concrete_ingredients.Pancake;
import main.concrete_ingredients.Syrup;

public interface IVisitor {
    void visitPancake(Pancake p);
    void visitSyrup(Syrup s);
    void visitEgg(Egg e);
    void visitMenu(Menu m);
}
