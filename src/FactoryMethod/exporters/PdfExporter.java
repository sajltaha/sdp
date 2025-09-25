package FactoryMethod.exporters;

import FactoryMethod.interfaces.IExporter;

public class PdfExporter implements IExporter {
    public void export(String data) { System.out.println("Exporting to PDF: " + data); }
    public String getName() { return "PDF"; }
}


