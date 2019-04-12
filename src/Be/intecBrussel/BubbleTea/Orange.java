package Be.intecBrussel.BubbleTea;

import java.util.ArrayList;
import java.util.List;

public class Orange extends Fruit {

    private String name;
    private double price = 0.50;

    public Orange() {
    }
    public Orange(String name){
       this.name = name;
    }
    public Orange(String name,double price){
        this.name = name;
        setPrice(price);
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void boil() {
        System.out.println("Ingrediënts are boiling");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Register {

        private double profit;
        private List<Ticket> ticketsList = new ArrayList<>();

        public Register() {

        }

        //setters en getters
        public double getProfit() {
            return profit;
        }

        public void setProfit(double profit) {
            this.profit = profit;
        }

        public List<Ticket> getTicketsList() {
            return ticketsList;
        }

        public void setTickets(List<Ticket> tickets) {
            this.ticketsList = tickets;
        }

        //methods
        public void AddToTicketList(Ticket HFS){
            ticketsList.add(HFS);
            calculateProfit();


        }
        public void calculateProfit(){

            for (Ticket h : ticketsList){
                profit += h.getPrice();

            }

        }

        @Override
        public String toString() {
            return "Register : " +
                    "profit = " + profit +
                    " \n " + ticketsList;
        }
    }
}
