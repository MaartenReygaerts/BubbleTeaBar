package Be.intecBrussel.Main;

import Be.intecBrussel.BubbleTea.*;

public class AppV3 {
    public static void main(String[] args) {
        Apple ingred1 = new Apple();
        Bubble ingred2 = new Bubble(Taste.SOURAPPLE);
        Strawberry ingred3 = new Strawberry(1);
        Orange ingred4 = new Orange(0.75);

        System.out.println(ingred1);
        System.out.println(ingred2);
        System.out.println(ingred3);
        System.out.println(ingred4);
    }
}
