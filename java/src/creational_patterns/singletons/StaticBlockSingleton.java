package creational_patterns.singletons;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong while creating instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
