import Tick.DefaultTickets;
import Tick.seniorCitisen;
import Tick.ChildrenTicket;

public class Main {
    public static void main(String[] args) {
      DefaultTickets DefaultTickets = new DefaultTickets(70,9);
      seniorCitisen sitisens = new seniorCitisen(70,30,5);
      ChildrenTicket Children = new ChildrenTicket(70,50,11);
      float Price = DefaultTickets.AllPrice() + sitisens.AllPrice() + Children.AllPrice();
        System.out.println("Стоимость всех билетов - " + Price );
    }
}