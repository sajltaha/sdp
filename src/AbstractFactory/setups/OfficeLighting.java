package AbstractFactory.setups;

import AbstractFactory.interfaces.ILightingSystem;

public class OfficeLighting implements ILightingSystem {
    public void install() { System.out.println("Installing motion-activated panel lights"); }
    public String getName() { return "Office Lighting"; }
}


