package creational_patterns.factory;

public class OffRoadCar extends Car {

    public OffRoadCar(String brand, Engine engine) {
        super(brand, engine);
    }

    @Override
    public void noise() {
        System.out.println("VRUM VRUM");
    }
}
