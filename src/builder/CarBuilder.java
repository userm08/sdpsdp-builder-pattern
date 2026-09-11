package builder;

public interface CarBuilder {

    CarBuilder setBrand(String brand);

    CarBuilder setModel(String model);

    CarBuilder setEngine(String engine);

    CarBuilder setColor(String color);

    CarBuilder setSunroof(boolean sunroof);

    Car build();
}