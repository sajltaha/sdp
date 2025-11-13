package main.interfaces;

public interface IIngredient {
    String getName();
    float getCalories();
    float getPrice();
    void accept(IVisitor visitor);
}