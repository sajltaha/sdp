package AbstractFactory;

import AbstractFactory.interfaces.IClimateSystem;
import AbstractFactory.interfaces.ILightingSystem;
import AbstractFactory.interfaces.ISecuritySystem;

public abstract class SmartHomeFactory {
    public abstract ILightingSystem createLighting();
    public abstract ISecuritySystem createSecurity();
    public abstract IClimateSystem createClimate();
}


