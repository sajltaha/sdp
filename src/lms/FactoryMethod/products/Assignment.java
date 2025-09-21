package lms.FactoryMethod.products;

import lms.FactoryMethod.interfaces.IProduct;

public class Assignment implements IProduct {
    @Override
    public void display() {
        System.out.println("Displaying Assignment");
    }
}
