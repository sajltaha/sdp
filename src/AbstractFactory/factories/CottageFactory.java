package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.ClimateSystem;
import AbstractFactory.interfaces.LightingSystem;
import AbstractFactory.interfaces.SecuritySystem;
import AbstractFactory.setups.CottageClimate;
import AbstractFactory.setups.CottageLighting;
import AbstractFactory.setups.CottageSecurity;

public class CottageFactory extends SmartHomeFactory {
    public LightingSystem createLighting() { return new CottageLighting(); }
    public SecuritySystem createSecurity() { return new CottageSecurity(); }
    public ClimateSystem createClimate() { return new CottageClimate(); }
}


