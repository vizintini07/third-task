package Tick;
 public class SeniorCitisen {
        float price;
        float discount;
        float number;
    public SeniorCitisen(float price, float discount, float number) {
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
     public int getNumberOfTickets() {
         return (int) number;
     }
 }

