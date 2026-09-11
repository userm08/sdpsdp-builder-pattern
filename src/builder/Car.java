package builder;

public class Car {

    private final String brand;
    private final String model;
    private final String engine;
    private final String color;
    private final boolean sunroof;

    public Car(String brand, String model, String engine, String color, boolean sunroof) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.sunroof = sunroof;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public boolean hasSunroof() {
        return sunroof;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                '}';
    }
}