package AbstractFactory.setups;

import AbstractFactory.interfaces.SecuritySystem;

public class CottageSecurity implements SecuritySystem {
    public void install() { System.out.println("Installing perimeter sensors and gate camera"); }
    public String getName() { return "Cottage Security"; }
}


