package main;

import main.composit.Menu;
import main.concrete_ingredients.Egg;
import main.concrete_ingredients.Pancake;
import main.concrete_ingredients.Syrup;
import main.visitors.NutritionVisitor;
import main.visitors.PriceVisitor;

public class Main {
    public static void main(String[] args) {
        Menu breakfast = new Menu("Healthy Breakfast");
        breakfast.add(new Pancake());
        breakfast.add(new Syrup());
        breakfast.add(new Egg());
        breakfast.add(new Egg());

        Menu special = new Menu("Special Order");
        special.add(new Pancake());
        special.add(new Egg());

        Menu fullMenu = new Menu("Full Menu");
        fullMenu.add(breakfast);
        fullMenu.add(special);

        System.out.println("=== NUTRITION ===");
        NutritionVisitor nutrition = new NutritionVisitor();
        fullMenu.accept(nutrition);
        System.out.println("Total calories: " + nutrition.getTotalCalories());

        System.out.println("\n=== PRICE ===");
        PriceVisitor price = new PriceVisitor();
        fullMenu.accept(price);
        System.out.printf("Total price: $%.2f%n", price.getTotalPrice());
    }
}