package creational_patterns.builder;

public enum PattyCookingLevel {
    MEDIUM_RARE,
    MEDIUM_WELL,
    WELL_DONE;

    PattyCookingLevel() {}

    @Override
    public String toString() {
        return this
                .name()
                .toLowerCase()
                .replaceAll("_", " ");
    }
}
