package Be.intecBrussel.BubbleTea;

public abstract class Spice extends BubbleTeaIngredient implements Boilable{
private String name;

    public Spice() {
    }

    public Spice(String name) {
       this.name=name;
    }
    public Spice(String name, double price){
        super(price);
        this.name=name;
    }

}
