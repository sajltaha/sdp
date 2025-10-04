package main.refined_abstractions;

import main.abstraction.Vehicle;
import main.implementor.IWorkshop;

public class Car extends Vehicle {
    public Car(IWorkshop workShop1, IWorkshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workShop1.work();
        workShop2.work();
        System.out.println();
    }
}
