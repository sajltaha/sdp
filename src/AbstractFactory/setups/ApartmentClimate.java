package AbstractFactory.setups;

import AbstractFactory.interfaces.ClimateSystem;

public class ApartmentClimate implements ClimateSystem {
    public void install() { System.out.println("Setting up smart thermostat and humidifier"); }
    public String getName() { return "Apartment Climate"; }
}


