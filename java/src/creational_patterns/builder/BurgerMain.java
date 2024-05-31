package creational_patterns.builder;

public class BurgerMain {
    public static void main(String[] args) {
        try {
            Burger a = Burger
                    .builder()
                    .withBun(BunType.BRIOCHE)
                    .withPattyCookedAt(PattyCookingLevel.MEDIUM_WELL)
                    .withSesameSeeds()
                    .withSpecialSauce()
                    .build();

            System.out.println(a);

            Burger b = Burger
                    .builder()
                    .withBun(BunType.POTATO)
                    .withPattyCookedAt(PattyCookingLevel.MEDIUM_RARE)
                    .withSpecialSauce()
                    .build();

            System.out.println(b);

            Burger c = Burger
                    .builder()
                    .withBun(BunType.INTEGRAL)
                    .withPattyCookedAt(PattyCookingLevel.WELL_DONE)
                    .withSesameSeeds()
                    .build();

            System.out.println(c);

            Burger another = Burger
                    .builder()
                    .withBun(BunType.BRIOCHE)
                    .withPattyCookedAt(PattyCookingLevel.WELL_DONE)
                    .build();

            System.out.println(another);

            Burger _ = Burger
                    .builder()
                    .build();
        } catch (BurgerCreationException exception) {
            System.out.println("Burger exception example: " + exception.getMessage());
        }
    }
}
