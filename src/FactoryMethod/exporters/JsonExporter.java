package FactoryMethod.exporters;

import FactoryMethod.interfaces.IExporter;

public class JsonExporter implements IExporter {
    public void export(String data) { System.out.println("Exporting to JSON: {\"data\": \"" + data + "\"}"); }
    public String getName() { return "JSON"; }
}


