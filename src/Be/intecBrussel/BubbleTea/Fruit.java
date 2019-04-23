package Be.intecBrussel.BubbleTea;

public abstract class Fruit extends BubbleTeaIngredients implements Boilable{
    public Fruit() {
    }

    public Fruit(double price) {
        super(price);
    }
}
