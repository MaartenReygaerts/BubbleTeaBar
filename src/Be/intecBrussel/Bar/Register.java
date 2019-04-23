package Be.intecBrussel.Bar;

import java.util.LinkedList;
import java.util.List;

public class Register {
    private double profit;
    List<Ticket> tickets = new LinkedList<>();


    //constructor
    public Register() {
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
        profit += ticket.getPrice();
    }
    public void acceptTicket(Ticket ticketln){
        this.tickets.add(ticketln);
        this.profit += ticketln.getPrice();
    }



    public void calculateTotalPrice(){

    }
}
