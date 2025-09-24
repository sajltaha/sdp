package AbstractFactory;

import AbstractFactory.interfaces.ClimateSystem;
import AbstractFactory.interfaces.LightingSystem;
import AbstractFactory.interfaces.SecuritySystem;

public abstract class SmartHomeFactory {
    public abstract LightingSystem createLighting();
    public abstract SecuritySystem createSecurity();
    public abstract ClimateSystem createClimate();
}


