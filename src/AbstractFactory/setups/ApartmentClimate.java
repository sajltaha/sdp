package AbstractFactory.setups;

import AbstractFactory.interfaces.IClimateSystem;

public class ApartmentClimate implements IClimateSystem {
    public void install() { System.out.println("Setting up smart thermostat and humidifier"); }
    public String getName() { return "Apartment Climate"; }
}


