package creational_patterns.abstract_factory;

public class HouseFactory {
    public static House getHouse(HouseAbstractFactory factory) {
        if (factory == null) {
            throw new RuntimeException("Factory was not provided to method!");
        }
        return factory.createHouse();
    }

    public static void main(String[] args) {
        House campHouse = getHouse(new CampHouseFactory("Blue", 2, 2));
        House lakeHouse = getHouse(new LakeHouseFactory("Yellow", 7, 3));
        System.out.println(campHouse);
        System.out.println(lakeHouse);
    }
}
