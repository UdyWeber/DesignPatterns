package creational_patterns.builder;

public class Burger {
    private final BunType bun;
    private final boolean hasSesameSeeds;
    private final boolean hasSpecialSauce;
    private final PattyCookingLevel pattyCookingLevel;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.pattyCookingLevel = builder.pattyCookingLevel;
        this.hasSesameSeeds = builder.hasSesameSeeds;
        this.hasSpecialSauce = builder.hasSpecialSauce;
    }

    public static BurgerBuilder builder() {
        return new BurgerBuilder();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Your burger with ");
        builder.append(bun).append(" bun");

        if (hasSesameSeeds) {
            builder.append(", with sesame seeds on top");
        }

        builder.append(" and ").append(pattyCookingLevel).append(" patty");

        if (hasSpecialSauce) {
            builder.append(", covered with special sauce");
        }

        builder.append(" is ready to be eaten!");

        return builder.toString();
    }

    protected static class BurgerBuilder {
        private BunType bun;
        private boolean hasSesameSeeds;
        private boolean hasSpecialSauce;
        private PattyCookingLevel pattyCookingLevel;

        public BurgerBuilder withBun(BunType bun) {
            this.bun = bun;
            return this;
        }
        public BurgerBuilder withPattyCookedAt(PattyCookingLevel pattyCookingLevel) {
            this.pattyCookingLevel = pattyCookingLevel;
            return this;
        }
        public BurgerBuilder withSesameSeeds() {
            this.hasSesameSeeds = true;
            return this;
        }
        public BurgerBuilder withSpecialSauce() {
            this.hasSpecialSauce = true;
            return this;
        }
        public Burger build() throws BurgerCreationException {
            if (this.bun == null || this.pattyCookingLevel == null) {
                throw new BurgerCreationException("Burger cannot be created without a bun or a patty cooking level");
            }

            return new Burger(this);
        }
    }
}
