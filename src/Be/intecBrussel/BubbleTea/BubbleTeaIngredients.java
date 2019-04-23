package Be.intecBrussel.BubbleTea;

public abstract class BubbleTeaIngredients {
    private double price;

    public BubbleTeaIngredients() {
    }

    public BubbleTeaIngredients(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BubbleTeaIngredients{" +
                "price=" + price +
                '}';
    }
}
