package Be.intecBrussel.BubbleTea;

public class Apple extends Fruit{
    private double price = 0.75;

    public Apple() {
    }

    public Apple(double price) {
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
        System.out.println("Adding Apple to the boil");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                '}';
    }
}
