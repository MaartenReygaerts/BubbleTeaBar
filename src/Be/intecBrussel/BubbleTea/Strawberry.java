package Be.intecBrussel.BubbleTea;

public class Strawberry extends Fruit {
    private double price = 0.50;

    public Strawberry() {

    }

    public Strawberry(double price) {
        super(price);

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
    public void Boil() {
        System.out.println("Adding StrawBerry to the boil");
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "price=" + price +
                '}';
    }
}
