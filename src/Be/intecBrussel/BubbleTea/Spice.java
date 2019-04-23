package Be.intecBrussel.BubbleTea;

public abstract class Spice extends BubbleTeaIngredients implements Boilable{
    public Spice() {
    }

    public Spice(double price) {
        super(price);
    }
}
