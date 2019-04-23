package Be.intecBrussel.BubbleTea;

public class Ginger extends Spice {
    private double price = 1;

    public Ginger() {
    }

    public Ginger(double price) {
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
        System.out.println("Adding Ginger to the boil");
    }

    @Override
    public String toString() {
        return "Ginger{" +
                "price=" + price +
                '}';
    }
}
