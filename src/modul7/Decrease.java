package modul7;
import  java.util.Comparator;

public class Decrease implements Comparator<Order> {
    @Override
    public  int compare(Order order1, Order order2){
        return order1.getPrice()-order2.getPrice();
    }

}
