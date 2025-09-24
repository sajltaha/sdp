package AbstractFactory.setups;

import AbstractFactory.interfaces.SecuritySystem;

public class OfficeSecurity implements SecuritySystem {
    public void install() { System.out.println("Installing access cards and CCTV network"); }
    public String getName() { return "Office Security"; }
}


