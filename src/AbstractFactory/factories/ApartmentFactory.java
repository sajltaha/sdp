package AbstractFactory.factories;

import AbstractFactory.SmartHomeFactory;
import AbstractFactory.interfaces.IClimateSystem;
import AbstractFactory.interfaces.ILightingSystem;
import AbstractFactory.interfaces.ISecuritySystem;
import AbstractFactory.setups.ApartmentClimate;
import AbstractFactory.setups.ApartmentLighting;
import AbstractFactory.setups.ApartmentSecurity;

public class ApartmentFactory extends SmartHomeFactory {
    public ILightingSystem createLighting() { return new ApartmentLighting(); }
    public ISecuritySystem createSecurity() { return new ApartmentSecurity(); }
    public IClimateSystem createClimate() { return new ApartmentClimate(); }
}


