package AbstractFactory.setups;

import AbstractFactory.interfaces.ISecuritySystem;

public class OfficeSecurity implements ISecuritySystem {
    public void install() { System.out.println("Installing access cards and CCTV network"); }
    public String getName() { return "Office Security"; }
}


