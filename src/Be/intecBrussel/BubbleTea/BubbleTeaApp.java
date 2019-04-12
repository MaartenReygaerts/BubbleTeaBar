package Be.intecBrussel.BubbleTea;

import java.util.ArrayList;
import java.util.List;

public class BubbleTeaApp {
    public static void main(String[] args) {


        Cinamon cinamon = new Cinamon();
        Bubble limebubble = new Bubble(0.50,Taste.LIME);

        Apple apple = new Apple();
        Bubble zureAppelBubble = new Bubble(Taste.SOUR_APPLE);
        StrawBerry strawBerry = new StrawBerry("StrawBerry",0.78);
        Orange orange = new Orange();
        StrawBerry strawBerry1 = new StrawBerry("Stawberry");
        System.out.println("*** opdracht 3 ***");
        System.out.println(strawBerry);
        System.out.println(strawBerry1);

        System.out.println("*** Opdracht 4 ***");
        List<BubbleTeaIngredient> lijst = new ArrayList<>();
        lijst.add(new Apple("Apple"));
        lijst.add(new Bubble(Taste.SOUR_APPLE));
        lijst.add(new StrawBerry("Strawberry"));


        double totalPrice = 0;
        for (BubbleTeaIngredient b : lijst) {
            totalPrice += b.getPrice();

        }
        System.out.println(totalPrice);

        lijst.stream()
                .filter(s->s instanceof Boilable)
                .forEach(System.out::println);






    }


}
