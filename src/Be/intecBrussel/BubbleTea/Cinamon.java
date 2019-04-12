package Be.intecBrussel.BubbleTea;

public class Cinamon extends Spice {

    private String name;
    private double price = 0.50;

    //constructor
    public Cinamon() {

    }
    public Cinamon(String name){
        this.name = name;
    }
    public Cinamon(String name, double price){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cinamon{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void boil() {
        System.out.println("Ingrediënts are boiling");
    }
}
