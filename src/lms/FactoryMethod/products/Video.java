package lms.FactoryMethod.products;

import lms.FactoryMethod.interfaces.IProduct;

public class Video implements IProduct {
    @Override
    public void display() {
        System.out.println("Displaying Video");
    }
}
