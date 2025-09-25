package FactoryMethod.exporters;

import FactoryMethod.interfaces.IExporter;

public class CsvExporter implements IExporter {
    public void export(String data) { System.out.println("Exporting to CSV: " + data.replace(" ", ",")); }
    public String getName() { return "CSV"; }
}


