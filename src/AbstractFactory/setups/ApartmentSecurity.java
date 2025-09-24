package AbstractFactory.setups;

import AbstractFactory.interfaces.SecuritySystem;

public class ApartmentSecurity implements SecuritySystem {
    public void install() { System.out.println("Installing door sensors and hallway camera"); }
    public String getName() { return "Apartment Security"; }
}


