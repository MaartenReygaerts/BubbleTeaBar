package Be.intecBrussel;

public class KassaApp {
    public static void main(String[] args) {

        Orange.Register register = new Orange.Register();

        register.AddToTicketList(new Ticket(15.20));
        register.AddToTicketList(new Ticket(20.45));
        register.AddToTicketList(new Ticket(78.56));
        register.AddToTicketList(new Ticket(56.00));
        register.AddToTicketList(new Ticket(7.99));
        register.AddToTicketList(new Ticket(5.84));
        register.AddToTicketList(new Ticket(9.99));
        register.AddToTicketList(new Ticket(23.00));
        register.AddToTicketList(new Ticket(7.47));
        register.AddToTicketList(new Ticket(12.59));

        System.out.println(register);

    }
}
