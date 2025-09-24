package AbstractFactory.setups;

import AbstractFactory.interfaces.LightingSystem;

public class CottageLighting implements LightingSystem {
    public void install() { System.out.println("Installing outdoor path lights and porch lamps"); }
    public String getName() { return "Cottage Lighting"; }
}


