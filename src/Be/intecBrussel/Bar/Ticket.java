package Be.intecBrussel.Bar;

public class Ticket {
    private int ticketNr;
    private double price;
    private static int count = 1;

    //constructor
    public Ticket() {
    }

    public Ticket(double price) {
        this.price = price;
        this.ticketNr = count++;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNr=" + ticketNr +
                ", price=" + price +
                '}';
    }
}
