package AbstractFactory.setups;

import AbstractFactory.interfaces.ISecuritySystem;

public class CottageSecurity implements ISecuritySystem {
    public void install() { System.out.println("Installing perimeter sensors and gate camera"); }
    public String getName() { return "Cottage Security"; }
}


