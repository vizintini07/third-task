package Tick;
 public class seniorCitisen {
        float price;
        float discount;
        float number;
    public seniorCitisen(float price, float discount, float number) {
        this.price = price;
        this.discount = discount;
        this.number = number;
    }
     public float AllPrice(){
         return (getTicketPrice() - (getTicketPrice()*getDiscount()/100)) * getNumberOfTickets() ;
    }
     public float getTicketPrice() {

         return price;
     }
     public float getDiscount() {

         return discount;
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

