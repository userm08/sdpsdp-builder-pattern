package builder;

public class LuxuryCarBuilder extends BaseCarBuilder {

    @Override
    public Car build() {
        validate();

        return new Car(brand, model, engine, color, sunroof);
    }
}