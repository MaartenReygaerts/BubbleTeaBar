package Be.intecBrussel.Main;

import Be.intecBrussel.Bar.BubbleTeaBar;
import Be.intecBrussel.Bar.Order;
import Be.intecBrussel.Bar.Ticket;
import Be.intecBrussel.BubbleTea.*;

import java.util.ArrayList;
import java.util.List;

public class AppV6 {
    public static void main(String[] args) {

        BubbleTeaBar bar = new BubbleTeaBar();

        List<BubbleTeaIngredients> test = new ArrayList<>();
        BubbleTeaIngredients ingred1 = new Apple();
        BubbleTeaIngredients ingred2 = new Bubble(Taste.STRAWBERRY);

        test.add(ingred1);
        test.add(ingred2);

        Order order1 = new Order(test);

        Ticket ticket1 = new Ticket(order1);

        bar.acceptTicket(ticket1);

        Ticket ticket2 = new Ticket(new Order(new ArrayList<>() {
            {
                add(new Cinamon());
                add(new Bubble(Taste.SWEETAPPLE));
                add(new Cream());
            }
        }));

        bar.acceptTicket(ticket2);

        Order order3 = order1;

        Ticket ticket3 = new Ticket(order3);

        bar.acceptTicket(ticket3);

        System.out.println("Prijs ticket1 " + ticket1.getPrice());
        System.out.println("Prijs ticket2 " +ticket2.getPrice());
        System.out.println("Prijs ticket3 " +ticket3.getPrice());
        System.out.println("Total profit " + bar.getProfit());
    }
}
