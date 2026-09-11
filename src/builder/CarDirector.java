package builder;

public class CarDirector {

    public Car buildLuxuryCar(CarBuilder builder) {
        return builder
                .setBrand("BMW")
                .setModel("X5")
                .setEngine("3.0L")
                .setColor("Black")
                .setSunroof(true)
                .build();
    }

    public Car buildSportsCar(CarBuilder builder) {
        return builder
                .setBrand("Porsche")
                .setModel("911")
                .setEngine("4.0L")
                .setColor("Red")
                .setSunroof(false)
                .build();
    }
}