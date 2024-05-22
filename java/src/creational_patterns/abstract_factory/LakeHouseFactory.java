package creational_patterns.abstract_factory;

public class LakeHouseFactory implements HouseAbstractFactory {
    private final String color;
    private final int windows;
    private final int bathrooms;

    public LakeHouseFactory(String color, int windows, int bathrooms) {
        this.color = color;
        this.windows = windows;
        this.bathrooms = bathrooms;
    }

    @Override
    public House createHouse() {
        return new LakeHouse(this.color, this.windows, this.bathrooms);
    }
}
