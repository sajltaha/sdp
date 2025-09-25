package AbstractFactory.setups;

import AbstractFactory.interfaces.IClimateSystem;

public class CottageClimate implements IClimateSystem {
    public void install() { System.out.println("Installing heat pump and floor heating controls"); }
    public String getName() { return "Cottage Climate"; }
}


