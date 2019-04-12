package Be.intecBrussel.BubbleTea;

public class StrawBerry extends Fruit {

    private String name;
    private double price = 0.50;
    //constructor
    public StrawBerry() {
    }
    public StrawBerry(String name){
     this.name = name;
    }

    public StrawBerry(String name ,double price) {
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
        return "StrawBerry{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void boil() {
        System.out.println("Ingrediënts are boiling");
    }
}
