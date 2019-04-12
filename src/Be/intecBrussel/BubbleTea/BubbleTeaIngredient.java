package Be.intecBrussel.BubbleTea;

public abstract class BubbleTeaIngredient {
    private double price;





    //constructors
    public BubbleTeaIngredient() {
    }



    public BubbleTeaIngredient( double price) {
        this.price = price;

    }


    //getters en setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
