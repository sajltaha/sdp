package FactoryMethod;

import FactoryMethod.interfaces.IExporter;
import FactoryMethod.exporters.CsvExporter;
import FactoryMethod.exporters.JsonExporter;
import FactoryMethod.exporters.PdfExporter;

public class ExporterFactory {
    public static IExporter create(String type) {
        return switch (type.toLowerCase()) {
            case "pdf" -> new PdfExporter();
            case "csv" -> new CsvExporter();
            case "json" -> new JsonExporter();
            default -> null;
        };
    }
}


