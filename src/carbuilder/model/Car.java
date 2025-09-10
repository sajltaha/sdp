package carbuilder.model;
import carbuilder.builder.Engine;

public class Car {
    private final int seats;
    private final Engine engine;
    private final boolean hasTripComputer;
    private final boolean hasGPS;

    public Car(int seats, Engine engine, boolean hasTripComputer, boolean hasGPS) {
        this.seats = seats;
        this.engine = engine;
        this.hasTripComputer = hasTripComputer;
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return  "\n- Seats: " + seats +
                "\n- Engine: " + engine.getType() +
                "\n- Trip Computer: " + (hasTripComputer ? "Included" : "Not included") +
                "\n- GPS: " + (hasGPS ? "Included" : "Not included") +
                "\n";
    }
}