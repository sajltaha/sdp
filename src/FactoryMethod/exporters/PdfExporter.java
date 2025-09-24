package FactoryMethod.exporters;

import FactoryMethod.interfaces.Exporter;

public class PdfExporter implements Exporter {
    public void export(String data) { System.out.println("Exporting to PDF: " + data); }
    public String getName() { return "PDF"; }
}


