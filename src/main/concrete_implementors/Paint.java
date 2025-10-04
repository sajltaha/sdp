package main.concrete_implementors;

import main.implementor.IWorkshop;

public class Paint implements IWorkshop {
    @Override
    public void work() {
        System.out.println("   -> Painting the vehicle... Done.");
    }
}
