package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.ClimateSystem;
import AbstractFactory.interfaces.LightingSystem;
import AbstractFactory.interfaces.SecuritySystem;
import AbstractFactory.setups.OfficeClimate;
import AbstractFactory.setups.OfficeLighting;
import AbstractFactory.setups.OfficeSecurity;

public class OfficeFactory extends SmartHomeFactory {
    public LightingSystem createLighting() { return new OfficeLighting(); }
    public SecuritySystem createSecurity() { return new OfficeSecurity(); }
    public ClimateSystem createClimate() { return new OfficeClimate(); }
}


