package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.ClimateSystem;
import AbstractFactory.interfaces.LightingSystem;
import AbstractFactory.interfaces.SecuritySystem;
import AbstractFactory.setups.ApartmentClimate;
import AbstractFactory.setups.ApartmentLighting;
import AbstractFactory.setups.ApartmentSecurity;

public class ApartmentFactory extends SmartHomeFactory {
    public LightingSystem createLighting() { return new ApartmentLighting(); }
    public SecuritySystem createSecurity() { return new ApartmentSecurity(); }
    public ClimateSystem createClimate() { return new ApartmentClimate(); }
}


