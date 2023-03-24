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
    public int getNumberOfTickets() {
        return (int) number;
    }
}

