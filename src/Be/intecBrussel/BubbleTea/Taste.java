package Be.intecBrussel.BubbleTea;

public enum Taste {
    SOUR_APPLE("Sour apple"),
    SWEET_APPLE("Sweet apple"),
    LIME("Lime"),
    STRAWBERRY("Strawberry"),
    REDBERRY("Redberry"),
    BLUEBERRY("Blueberry");

    private String taste;

    Taste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }
}
