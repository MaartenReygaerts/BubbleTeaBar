package Be.intecBrussel.Bar;

import Be.intecBrussel.BubbleTea.BubbleTeaIngredients;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

public class Ticket {
    private int ticketNr;
    private double price;
    private static int count = 1;
    private Order order;
    private LocalDateTime ticketTime;


    //constructor
    public Ticket() {
    }

    public Ticket(Order order) {
        this.order = order;
        calcPrice(order.getIngredients());
        this.ticketTime = LocalDateTime.now();


    }

    //getters en setters
    public int getTicketNr() {
        return ticketNr;
    }

    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(LocalDateTime ticketTime) {
        this.ticketTime = ticketTime;
    }

    public double calcPrice(List<BubbleTeaIngredients> order){
        this.price = order
                .stream()
                .mapToDouble(i->i.getPrice())
                .sum();


        return this.price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNr=" + ticketNr +
                ", price=" + price +
                ", order=" + order +
                ", ticketTime=" + ticketTime +
                '}';
    }
}
