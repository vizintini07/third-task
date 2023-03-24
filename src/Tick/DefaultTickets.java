package Tick;

public class DefaultTickets {
    public
    float price;
    float number;

    public DefaultTickets(float price, float number) {
        this.price = price;
        this.number = number;
    }
    public float AllPrice() {
        return getTicketPrice() * getNumberOfTickets();
    }
    public float getTicketPrice() {

        return price;
    }

    public void setTicketPrice(float ticketPrice) {
        this.price = ticketPrice;
    }

    public int getNumberOfTickets() {
        return (int) number;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.number = numberOfTickets;

    }
}

