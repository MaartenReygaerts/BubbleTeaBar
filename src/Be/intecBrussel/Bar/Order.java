package Be.intecBrussel.Bar;

import Be.intecBrussel.BubbleTea.BubbleTeaIngredients;

import java.util.List;

public class Order {
    private int orderNr;
    private List<BubbleTeaIngredients> ingredients;

    public Order(List<BubbleTeaIngredients> ingredients) {
        this.ingredients = ingredients;
    }

    public List<BubbleTeaIngredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNr=" + orderNr +
                ", ingredients=" + ingredients +
                '}';
    }
}
