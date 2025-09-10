package carbuilder;

import carbuilder.builder.Builder;
import carbuilder.builder.CarBuilder;
import carbuilder.builder.Director;
import carbuilder.model.Car;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        Builder carBuilder = new CarBuilder();
        director.makeSportsCar(carBuilder);
        Car sportsCar = (Car) carBuilder.getResult();
        System.out.println("Sport Car: " + sportsCar);

        Builder carBuilder2 = new CarBuilder();
        director.makeStandardCar(carBuilder2);
        Car standardCar = (Car) carBuilder2.getResult();
        System.out.println("Standard Car: " + standardCar);
    }
}
