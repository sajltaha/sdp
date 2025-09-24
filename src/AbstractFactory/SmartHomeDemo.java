package AbstractFactory;

import AbstractFactory.factories.ApartmentFactory;
import AbstractFactory.factories.CottageFactory;
import AbstractFactory.factories.OfficeFactory;

public class SmartHomeDemo {
    public static void main(String[] args) {
        System.out.println(" APARTMENT SETUP ");
        new SmartHomeInstaller(new ApartmentFactory()).installAll();

        System.out.println(" OFFICE SETUP ");
        new SmartHomeInstaller(new OfficeFactory()).installAll();

        System.out.println(" COTTAGE SETUP ");
        new SmartHomeInstaller(new CottageFactory()).installAll();
    }
}


