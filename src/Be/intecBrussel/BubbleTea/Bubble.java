package Be.intecBrussel.BubbleTea;

public  class Bubble  extends BubbleTeaIngredient {

    private Taste type;

    //constructors
    public Bubble(Taste type) {
        this.type = type;
    }

    public Bubble(double price, Taste type) {
        super(price);
        this.type = type;
    }

    //getters en setters
    public Taste getType() {
        return type;
    }

    public void setType(Taste type) {
        this.type = type;
    }
}
