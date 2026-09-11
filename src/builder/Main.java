package builder;

public class Main {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car luxuryCar = director.buildLuxuryCar(new LuxuryCarBuilder());
        Car sportsCar = director.buildSportsCar(new SportsCarBuilder());

        System.out.println("Luxury car:");
        System.out.println(luxuryCar);

        System.out.println("\nSports car:");
        System.out.println(sportsCar);
    }
}