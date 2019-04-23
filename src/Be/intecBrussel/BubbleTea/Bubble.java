package Be.intecBrussel.BubbleTea;

public class Bubble extends BubbleTeaIngredients{
    private Taste type;
    private double price = 0.50;

    public Bubble(Taste type) {
        this.type = type;
    }

    public Bubble(double price, Taste type) {
        super(price);
        this.type = type;
    }

    public Taste getType() {
        return type;
    }

    public void setType(Taste type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
