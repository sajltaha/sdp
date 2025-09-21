package lms.AbstractFactory.products.stem;

import lms.AbstractFactory.interfaces.IAssignment;

public class StemAssignment implements IAssignment {
    @Override
    public void submit() {
        System.out.println("STEM Assignment: Lab report");
    }
}
