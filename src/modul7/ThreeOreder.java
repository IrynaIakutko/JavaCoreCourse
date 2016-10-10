package modul7;
import java.util.Comparator;

public class ThreeOreder  implements  Comparator<Order>{
    @Override
    public int compare(Order order1, Order order2) {
        String a = order1.getItemName();
        String b = order2.getItemName();
        if (!(a.equals(b))) {
            return b.compareTo(a);
        } else {if (order2.getShopIdentificator().compareTo(order1.getShopIdentificator())==0)
            {return (order2.getUser().getCity().compareTo(order1.getUser().getCity()));} else
            return order2.getShopIdentificator().compareTo(order1.getShopIdentificator());


        }
    }
}
