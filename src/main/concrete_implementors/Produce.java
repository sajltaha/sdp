package main.concrete_implementors;

import main.implementor.IWorkshop;

public class Produce implements IWorkshop {
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
