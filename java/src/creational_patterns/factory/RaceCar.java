package creational_patterns.factory;

public class RaceCar extends Car {
    public RaceCar(String brand, Engine engine) {
        super(brand, engine);
    }

    @Override
    public void noise() {
        System.out.println("RANDANDAN");
    }
}
