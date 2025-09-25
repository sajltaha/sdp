package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.IClimateSystem;
import AbstractFactory.interfaces.ILightingSystem;
import AbstractFactory.interfaces.ISecuritySystem;
import AbstractFactory.setups.CottageClimate;
import AbstractFactory.setups.CottageLighting;
import AbstractFactory.setups.CottageSecurity;

public class CottageFactory extends SmartHomeFactory {
    public ILightingSystem createLighting() { return new CottageLighting(); }
    public ISecuritySystem createSecurity() { return new CottageSecurity(); }
    public IClimateSystem createClimate() { return new CottageClimate(); }
}


