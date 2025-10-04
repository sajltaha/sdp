package main.refined_abstractions;

import main.abstraction.Vehicle;
import main.implementor.IWorkshop;
import java.util.List;

public class Bike extends Vehicle {
    public Bike(List<IWorkshop> workshops) {
        super(workshops);
    }

    @Override
    public void manufacture() {
        System.out.println("--- Manufacturing a new Bike ---");
        for (IWorkshop workshop : workshops) {
            workshop.work();
        }
        System.out.println("--- Bike is ready! ---\n");
    }
}
