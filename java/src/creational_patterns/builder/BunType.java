package creational_patterns.builder;

public enum BunType {
    BRIOCHE,
    INTEGRAL,
    POTATO;

    BunType() {}

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
