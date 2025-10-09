package main;

import main.abstraction.Vehicle;
import main.concrete_implementors.Assemble;
import main.concrete_implementors.Produce;
import main.refined_abstractions.Bike;
import main.refined_abstractions.Car;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
