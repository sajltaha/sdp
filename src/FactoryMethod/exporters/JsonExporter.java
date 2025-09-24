package FactoryMethod.exporters;

import FactoryMethod.interfaces.Exporter;

public class JsonExporter implements Exporter {
    public void export(String data) { System.out.println("Exporting to JSON: {\"data\": \"" + data + "\"}"); }
    public String getName() { return "JSON"; }
}


