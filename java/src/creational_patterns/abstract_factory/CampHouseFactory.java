package creational_patterns.abstract_factory;

public class CampHouseFactory implements HouseAbstractFactory {
    private final String color;
    private final int windows;
    private final int bathrooms;

    public CampHouseFactory(String color, int windows, int bathrooms) {
        this.color = color;
        this.windows = windows;
        this.bathrooms = bathrooms;
    }

    @Override
    public House createHouse() {
        return new CampHouse(this.color, this.windows, this.bathrooms);
    }
}
