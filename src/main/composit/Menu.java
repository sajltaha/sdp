package main.composit;

import main.interfaces.IIngredient;
import main.interfaces.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IIngredient {
    private final String name;
    private final List<IIngredient> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(IIngredient item) {
        items.add(item);
    }

    @Override public String getName() { return name; }
    @Override public double getCalories() { return 0; } // не используется
    @Override public double getPrice() { return 0; }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitMenu(this);
        for (IIngredient item : items) {
            item.accept(visitor);
        }
    }

    public List<IIngredient> getItems() {
        return items;
    }
}
