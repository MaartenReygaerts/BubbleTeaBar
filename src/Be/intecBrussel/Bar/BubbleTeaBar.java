package Be.intecBrussel.Bar;

public class BubbleTeaBar {
    private Register register;
    private double profit;

    public BubbleTeaBar() {
    }

    public void acceptTicket(Ticket ticketln){
        this.profit += ticketln.getPrice();
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "BubbleTeaBar{" +
                "register=" + register +
                ", profit=" + profit +
                '}';
    }
}
