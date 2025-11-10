package main.interfaces;

public interface IIngredient {
    String getName();
    double getCalories();
    double getPrice();
    void accept(IVisitor visitor);
}