package Be.intecBrussel.BubbleTea;

public class Cinamon extends Spice {
    private double price = 0.50;

    public Cinamon() {
    }

    public Cinamon(double price) {
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
        System.out.println("Adding Cinamon to the boil");
    }

    @Override
    public String toString() {
        return "Cinamon{" +
                "price=" + price +
                '}';
    }
}
