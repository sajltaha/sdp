package AbstractFactory.setups;

import AbstractFactory.interfaces.ClimateSystem;

public class CottageClimate implements ClimateSystem {
    public void install() { System.out.println("Installing heat pump and floor heating controls"); }
    public String getName() { return "Cottage Climate"; }
}


