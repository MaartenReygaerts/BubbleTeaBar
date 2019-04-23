package Be.intecBrussel.BubbleTea;

public enum Taste {
    SOURAPPLE("Sour Apple"),
    SWEETAPPLE("Sweet Apple"),
    LIME("Lime"),
    STRAWBERRY("Strawberry"),
    BLUEBERRY("Blueberry");

    private String name;

    Taste(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
