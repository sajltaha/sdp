package carbuilder.builder;

public class Director {
    public void makeSportsCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine(new Engine.SportEngine())
                .setTripComputer(true)
                .setGPS(true);
    }

    public void makeStandardCar(Builder builder) {
        builder.reset()
                .setSeats(5)
                .setEngine(new Engine.StandardEngine())
                .setTripComputer(true)
                .setGPS(false);
    }
}
