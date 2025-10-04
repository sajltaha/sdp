package main.concrete_implementors;

import main.implementor.IWorkshop;

public class Test implements IWorkshop {
    @Override
    public void work() {
        System.out.println("   -> Testing the vehicle... Passed quality control.");
    }
}
