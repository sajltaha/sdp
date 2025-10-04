package main;

import main.abstraction.Vehicle;
import main.concrete_implementors.Assemble;
import main.concrete_implementors.Paint;
import main.concrete_implementors.Produce;
import main.concrete_implementors.Test;
import main.implementor.IWorkshop;
import main.refined_abstractions.Bike;
import main.refined_abstractions.Car;
import main.refined_abstractions.Truck;
import java.util.List;

public class AdvancedBridgeDemo {
    public static void main(String[] args) {
        List<IWorkshop> standardCarAndTruckLine = List.of(new Produce(), new Assemble(), new Paint(), new Test());
        List<IWorkshop> simpleBikeLine = List.of(new Produce(), new Paint(), new Assemble());

        System.out.println("A customer ordered a standard car...");
        Vehicle car = new Car(standardCarAndTruckLine);
        car.manufacture();

        System.out.println("A customer ordered a simple bike...");
        Vehicle bike = new Bike(simpleBikeLine);
        bike.manufacture();

        System.out.println("A corporate client ordered a heavy-duty truck...");
        Vehicle truck = new Truck(standardCarAndTruckLine);
        truck.manufacture();
    }
}