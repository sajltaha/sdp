package AbstractFactory.setups;

import AbstractFactory.interfaces.ClimateSystem;

public class OfficeClimate implements ClimateSystem {
    public void install() { System.out.println("Installing centralized HVAC schedule"); }
    public String getName() { return "Office Climate"; }
}


