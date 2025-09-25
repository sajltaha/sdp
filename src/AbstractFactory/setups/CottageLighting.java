package AbstractFactory.setups;

import AbstractFactory.interfaces.ILightingSystem;

public class CottageLighting implements ILightingSystem {
    public void install() { System.out.println("Installing outdoor path lights and porch lamps"); }
    public String getName() { return "Cottage Lighting"; }
}


