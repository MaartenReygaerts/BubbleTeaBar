package Be.intecBrussel.BubbleTea;

public class Ginger extends Spice {
    private String name;
    private double price = 0.50;

    //constructor
    public Ginger() {
    }
    public Ginger(String name){
        this.name = name;
    }


    public Ginger(String name,double price) {
        this.name = name;
        setPrice(price);

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
        return "Ginger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //implementmethod
    @Override
    public void boil() {
        System.out.println("Ingrediënts are boiling");
    }
}
