package AbstractFactory.setups;

import AbstractFactory.interfaces.LightingSystem;

public class ApartmentLighting implements LightingSystem {
    public void install() { System.out.println("Installing dimmable LED strips in living room"); }
    public String getName() { return "Apartment Lighting"; }
}


