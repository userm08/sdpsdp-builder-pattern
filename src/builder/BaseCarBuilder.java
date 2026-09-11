package builder;

public abstract class BaseCarBuilder implements CarBuilder {

    protected String brand;
    protected String model;
    protected String engine;
    protected String color;
    protected boolean sunroof;

    @Override
    public CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this;
    }
    protected void validate() {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand is required");
        }

        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model is required");
        }

        if (engine == null || engine.isBlank()) {
            throw new IllegalArgumentException("Engine is required");
        }

        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color is required");
        }
    }
}