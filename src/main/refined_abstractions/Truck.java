package main.refined_abstractions;

import main.abstraction.Vehicle;
import main.implementor.IWorkshop;
import java.util.List;

public class Truck extends Vehicle {
    public Truck(List<IWorkshop> workshops) {
        super(workshops);
    }

    @Override
    public void manufacture() {
        System.out.println("--- Manufacturing a new Truck ---");
        for (IWorkshop workshop : workshops) {
            workshop.work();
        }
        System.out.println("--- Truck is ready! ---\n");
    }
}
