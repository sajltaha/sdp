package FactoryMethod.exporters;

import FactoryMethod.interfaces.Exporter;

public class CsvExporter implements Exporter {
    public void export(String data) { System.out.println("Exporting to CSV: " + data.replace(" ", ",")); }
    public String getName() { return "CSV"; }
}


