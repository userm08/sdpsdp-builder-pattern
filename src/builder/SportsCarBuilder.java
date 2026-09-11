package builder;

public class SportsCarBuilder extends BaseCarBuilder {

    @Override
    public Car build() {
        validate();

        return new Car(brand, model, engine, color, sunroof);
    }
}