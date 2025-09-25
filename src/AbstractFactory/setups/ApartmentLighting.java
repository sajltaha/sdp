package AbstractFactory.setups;

import AbstractFactory.interfaces.ILightingSystem;

public class ApartmentLighting implements ILightingSystem {
    public void install() { System.out.println("Installing dimmable LED strips in living room"); }
    public String getName() { return "Apartment Lighting"; }
}


