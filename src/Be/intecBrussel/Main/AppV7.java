package Be.intecBrussel.Main;

import Be.intecBrussel.Bar.BubbleTeaBar;
import Be.intecBrussel.Bar.Order;
import Be.intecBrussel.Bar.Ticket;
import Be.intecBrussel.BubbleTea.*;

import java.util.ArrayList;

public class AppV7 {
    public static void main(String[] args) {

        BubbleTeaBar bar = new BubbleTeaBar();

        Ticket ticket1 = new Ticket(new Order(new ArrayList<>(){
            {
                add(new Strawberry());
                add(new Cinamon());
                add(new Bubble(Taste.BLUEBERRY));
            }

        }
        ));

        bar.acceptTicket(ticket1);

        Ticket ticket2 = new Ticket(new Order(new ArrayList<>() {
            {
                add(new Apple());
                add(new Orange());
                add(new Bubble(Taste.SWEETAPPLE));
            }

        }
        ));
        bar.acceptTicket(ticket2);

        Ticket ticket3 = new Ticket(new Order(new ArrayList<>() {
            {
                add(new Apple());
                add(new Strawberry());
                add(new Bubble(Taste.SOURAPPLE));
            }

        }
        ));
        bar.acceptTicket(ticket3);

        System.out.println(ticket1.getTicketTime());
        System.out.println(ticket2.getTicketTime());
        System.out.println(ticket3.getTicketTime());



    }
}
