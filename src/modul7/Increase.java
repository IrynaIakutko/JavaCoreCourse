package modul7;
import  java.util.Comparator;

public class Increase implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        int a = order1.getPrice();
        int b = order2.getPrice();
        if (!(a == b)) {
            return b - a;
        } else {
            return (order2.getUser().getCity().compareTo(order1.getUser().getCity()));

        }
    }
}
