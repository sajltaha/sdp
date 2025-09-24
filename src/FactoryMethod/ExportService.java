package FactoryMethod;

import FactoryMethod.interfaces.Exporter;

public class ExportService {
    public void export(String type, String data) {
        System.out.println("\n=== Exporting Report ===");
        System.out.println("Type: " + type);
        Exporter exporter = ExporterFactory.create(type);
        if (exporter == null) {
            System.out.println("Unknown export type");
            return;
        }
        System.out.println("Using: " + exporter.getName());
        exporter.export(data);
        System.out.println("Done.");
    }
}


