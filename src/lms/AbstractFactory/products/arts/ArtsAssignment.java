package lms.AbstractFactory.products.arts;

import lms.AbstractFactory.interfaces.IAssignment;

public class ArtsAssignment implements IAssignment {
    @Override
    public void submit() {
        System.out.println("Arts Assignment: Draw sketch");
    }
}
