package AbstractFactory;

import AbstractFactory.interfaces.ClimateSystem;
import AbstractFactory.interfaces.LightingSystem;
import AbstractFactory.interfaces.SecuritySystem;

public class SmartHomeInstaller {
    private final SmartHomeFactory factory;

    public SmartHomeInstaller(SmartHomeFactory factory) {
        this.factory = factory;
    }

    public void installAll() {
        System.out.println("=== Installing smart home setup ===");

        LightingSystem lighting = factory.createLighting();
        SecuritySystem security = factory.createSecurity();
        ClimateSystem climate = factory.createClimate();

        System.out.println("\nLighting:");
        System.out.println("→ " + lighting.getName());
        lighting.install();

        System.out.println("\nSecurity:");
        System.out.println("→ " + security.getName());
        security.install();

        System.out.println("\nClimate:");
        System.out.println("→ " + climate.getName());
        climate.install();

        System.out.println("\nSetup complete.\n");
    }
}


