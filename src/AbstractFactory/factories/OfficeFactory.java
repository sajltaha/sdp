package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.IClimateSystem;
import AbstractFactory.interfaces.ILightingSystem;
import AbstractFactory.interfaces.ISecuritySystem;
import AbstractFactory.setups.OfficeClimate;
import AbstractFactory.setups.OfficeLighting;
import AbstractFactory.setups.OfficeSecurity;

public class OfficeFactory extends SmartHomeFactory {
    public ILightingSystem createLighting() { return new OfficeLighting(); }
    public ISecuritySystem createSecurity() { return new OfficeSecurity(); }
    public IClimateSystem createClimate() { return new OfficeClimate(); }
}


