package AbstractFactory.setups;

import AbstractFactory.interfaces.LightingSystem;

public class OfficeLighting implements LightingSystem {
    public void install() { System.out.println("Installing motion-activated panel lights"); }
    public String getName() { return "Office Lighting"; }
}


