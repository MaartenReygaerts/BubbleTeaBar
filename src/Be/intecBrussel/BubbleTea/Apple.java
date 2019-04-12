package Be.intecBrussel.BubbleTea;

public class Apple extends Fruit {
    private String name;
    private double price = 0.75;

    //constructor
    public Apple() {
    }

    public Apple(String name){
        this.name = name;
    }
    public Apple(String name,double price) {
        this.name = name;
        setPrice(price);

    }

    //getters en setters
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void boil() {
        System.out.println("Ingrediënts are boiling");
    }
}
