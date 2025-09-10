package carbuilder.builder;

import carbuilder.model.Car;

public class CarBuilder implements Builder {
    private int seats;
    private Engine engine;
    private boolean hasTripComputer;
    private boolean hasGPS;

    @Override
    public Builder reset() {
        this.seats = 0;
        this.engine = null;
        this.hasTripComputer = false;
        this.hasGPS = false;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    @Override
    public Car getResult() {
        return new Car(seats, engine, hasTripComputer, hasGPS);
    }
}
