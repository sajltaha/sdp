package AbstractFactory.setups;

import AbstractFactory.interfaces.IClimateSystem;

public class OfficeClimate implements IClimateSystem {
    public void install() { System.out.println("Installing centralized HVAC schedule"); }
    public String getName() { return "Office Climate"; }
}


