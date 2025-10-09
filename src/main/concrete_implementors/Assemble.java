package main.concrete_implementors;

import main.implementor.IWorkshop;

public class Assemble implements IWorkshop {
    @Override
    public void work() {
        System.out.print(" and Assembled.");
    }
}
