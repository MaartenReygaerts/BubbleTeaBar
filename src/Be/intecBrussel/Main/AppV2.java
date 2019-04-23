package Be.intecBrussel.Main;

import Be.intecBrussel.BubbleTea.Bubble;
import Be.intecBrussel.BubbleTea.Cinamon;
import Be.intecBrussel.BubbleTea.Strawberry;
import Be.intecBrussel.BubbleTea.Taste;

public class AppV2 {
    public static void main(String[] args) {
        Strawberry strawberry = new Strawberry(0.75);
        Cinamon cinamon = new Cinamon(0.50);
        Bubble limeBubble = new Bubble(Taste.LIME);

        System.out.println(strawberry.getClass().getName() + "Prijs " + strawberry.getPrice());
    }
}
