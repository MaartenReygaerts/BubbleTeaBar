package Be.intecBrussel.BubbleTea;

public abstract class Fruit extends BubbleTeaIngredient implements Boilable{

    private String name;
    public Fruit() {
    }

   public Fruit(String name){
        this.name = name;
   }

    public Fruit( String name,double price) {
        super(price);
        this.name=name;
    }


}
