package creational_patterns.abstract_factory;

public abstract class House {
    public String color;
    public int windows, bathrooms;

    @Override
    public String toString() {
        return String.format(
            "%s is %s and has a total of %d windows and %d bathrooms",
            this.getClass().getSimpleName(), this.color, this.windows, this.bathrooms
        );
    }
}
