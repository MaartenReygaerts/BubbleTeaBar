package Be.intecBrussel.BubbleTea;

public class Orange extends Fruit
{
    private double price = 0.50;

    public Orange() {
    }

    public Orange(double price) {
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
        System.out.println("Adding Orange to the boil");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "price=" + price +
                '}';
    }
}
