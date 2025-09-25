package AbstractFactory.setups;

import AbstractFactory.interfaces.ISecuritySystem;

public class ApartmentSecurity implements ISecuritySystem {
    public void install() { System.out.println("Installing door sensors and hallway camera"); }
    public String getName() { return "Apartment Security"; }
}


