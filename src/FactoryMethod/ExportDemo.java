package FactoryMethod;

public class ExportDemo {
    public static void main(String[] args) {
        ExportService svc = new ExportService();
        String data = "Quarterly Report Q3";
        svc.export("pdf", data);
        svc.export("csv", data);
        svc.export("json", data);
    }
}


