package modul7;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainTree {
    public static void main(String[] args) {

        Set<Order> orders= new TreeSet<>();
        User user1 = new User(011, "Pechkur1", "Vanya1", "Lvov", 1500);
        User user2 = new User(012, "Pechkur2", "Vanya2", "Lvov8", 3500);
        User user4 = new User(011, "Pechkur4", "Vanya4", "Lvov3", 6500);
        User user5 = new User(041, "Pechkur5", "Vanya5", "Lvov5", 8500);
        User user6 = new User(051, "Pechkur6", "Vanya6", "Lvov", 11500);
        orders.add(new Order(122,3500,Currency.UAH,"платье", "простор", user2));
        orders.add( new Order(122, 400, Currency.UAH, "платье", "простор", user2));
        orders.add( new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5));
        orders.add( new Order(124, 450, Currency.UAH, "туфли", "виртус", user4));
        orders.add( new Order(125, 770, Currency.USD, "носки", "сильпо", user5));
        orders.add( new Order(126, 890, Currency.UAH, "варешки", "привоз", user6));
        orders.add( new Order(124, 450, Currency.UAH, "туфли", "виртус", user4));
        orders.add( new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5));
        orders.add( new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1));
        orders.add( new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1));

        System.out.println("******************************orders \n");
        System.out.println(orders);
        System.out.println("******************************check if set contain Order where User’s lastName is - “Petrov” \n");
        System.out.println(contLastName(orders, "Petrov"));
        System.out.println("******************************print Order with largest price using only one set method - get  \n");
        System.out.println(getLargestPrice(orders));
        deleteUSD(orders);
        System.out.println("****************************** delete orders where currency is USD using Iterator \n");
        System.out.println( orders);

    }

    private static boolean contLastName(Set<Order> set, String lastName) {
      for (Order order : set) {
           if (order.getUser().getLastName().equals(lastName))
                           return true;
                 }
        return false;
    }

    private static Order getLargestPrice(Set<Order> set) {
        Order order = null;
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext())
                    order = iterator.next();
                return order;
    }

    private static void deleteUSD (Set<Order> set) {
        Iterator<Order> iterator = set.iterator();
        while (iterator.hasNext()) {
           if (iterator.next().getCurrency() == Currency.USD)
                           iterator.remove();
                   }
    }
    }

