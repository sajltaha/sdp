package main.abstraction;

import main.implementor.IWorkshop;
import java.util.List;

public abstract class Vehicle {
    protected List<IWorkshop> workshops;

    public Vehicle(List<IWorkshop> workshops) {
        this.workshops = workshops;
    }

    public abstract void manufacture();
}
