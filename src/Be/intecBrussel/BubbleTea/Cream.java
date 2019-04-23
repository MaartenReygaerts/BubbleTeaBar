package Be.intecBrussel.BubbleTea;

public  class Cream extends BubbleTeaIngredients {

    private double price = 0.50;

    public Cream(double price) {
        super(price);

    }

    public Cream() {
        super(0.50);

    }

    @Override
    public double getPrice() {
        return price;
    }


}
