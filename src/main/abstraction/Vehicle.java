package main.abstraction;

import main.implementor.IWorkshop;

public abstract class Vehicle {
    protected IWorkshop workShop1;
    protected IWorkshop workShop2;

    protected Vehicle(IWorkshop workShop1, IWorkshop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    public abstract void manufacture();
}
