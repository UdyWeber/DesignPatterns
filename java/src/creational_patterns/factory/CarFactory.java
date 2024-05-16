package creational_patterns.factory;

public class CarFactory {
    public static Car getCar(Class<?> type, String brand, Engine engine) {
        return switch (type.getSimpleName()) {
            case "OffRoadCar" -> new OffRoadCar(brand, engine);
            case "RaceCar" -> new RaceCar(brand,engine);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    public static void main(String[] args) {
        Car c = getCar(OffRoadCar.class, "Volvo", Engine.V8);
        c.noise();
    }
}
