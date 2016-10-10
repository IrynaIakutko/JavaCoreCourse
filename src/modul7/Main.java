package modul7;


import java.util.*;



public class Main {
    public static void main(String[] args) {
        User user1 = new User(011, "Pechkur1", "Vanya1", "Lvov", 1500);
        User user2 = new User(012, "Pechkur2", "Vanya2", "Lvov8", 3500);
        User user4 = new User(011, "Pechkur4", "Vanya4", "Lvov3", 6500);
        User user5 = new User(041, "Pechkur5", "Vanya5", "Lvov5", 8500);
        User user6 = new User(051, "Pechkur6", "Vanya6", "Lvov", 11500);
        Order order1=new Order(122,3500,Currency.UAH,"платье", "простор", user2);
        Order order2 = new Order(122, 400, Currency.UAH, "платье", "простор", user2);
        Order order3 = new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5);
        Order order4 = new Order(124, 450, Currency.UAH, "туфли", "виртус", user4);
        Order order5 = new Order(125, 770, Currency.USD, "носки", "сильпо", user5);
        Order order6 = new Order(126, 890, Currency.UAH, "варешки", "привоз", user6);
        Order order7 = new Order(124, 450, Currency.UAH, "туфли", "виртус", user4);
        Order order9 = new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5);
        Order order0 = new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1);
        Order order8 = new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1);
        List<Order> list = new ArrayList<>();
        list.add(order1);
        list.add(order2);
        list.add(order3);
        list.add(order4);
        list.add(order5);
        list.add(order6);
        list.add(order7);
        list.add(order8);
        list.add(order9);
        list.add(order0);
        System.out.println("************************* list /n");
        System.out.println(list);
        System.out.println("************************* sort list by Order price in decrease order  \n");
        list.sort(new Increase());
        System.out.println(list);
        System.out.println("************************* sort list by Order price in increase order AND User city  \n");
        list.sort(new Decrease());
        System.out.println(list);
        System.out.println("************************* sort list by Order itemName AND ShopIdentificator AND User city \n ");
        list.sort(new ThreeOreder());
        System.out.println(list);
        System.out.println("************************* delete duplicates from the list \n ");
        System.out.println( noDublicate(list));
        System.out.println("************************* delete items where price less than 1500 \n ");
        System.out.println(PriceMore(list, 1500));
        System.out.println("*************************separate list for two list - orders in USD and UAH \n ");
        System.out.println( Arrays.toString(sepTwoLists(list)));
        System.out.println("************************* separate list for as many lists as many unique cities are in User \n ");
        System.out.println( Arrays.toString(sepListCities(list)));
    }

    private static List<Order> noDublicate(List<Order> list) {
        Set<Order> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    private static List<Order> PriceMore(List<Order> list, int price) {
        List<Order> newList = new ArrayList<>();
        for (Order order : list) {
            if (order.getPrice() >= price) {
                newList.add(order);
            }
        }
        return newList;
    }

    private static List[] sepTwoLists(List<Order> list) {
        List[] lists = {new ArrayList<Order>(), new ArrayList<Order>()};
        for (Order order : list) {
            if (order.getCurrency() == Currency.UAH) {
                lists[0].add(order);
            } else if (order.getCurrency() == Currency.UAH) {
                lists[1].add(order);
            }
        }
        return lists;
    }

    private static List[] sepListCities(List<Order> list) {
        Set<String> uniqueCities = new HashSet<>();

        for (Order order : list) {
            uniqueCities.add(order.getUser().getCity());
        }
        ArrayList[] lists = new ArrayList[uniqueCities.size()];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<Order>();
        }
        for (Order order : list) {
            addList(order, lists);
        }
        return lists;
    }

    private static void addList(Order order, List<Order>[] lists) {
       for (List<Order> list : lists) {
                 if (list.isEmpty()) {
                list.add(order);
                break;
                 } else if (list.get(0).getUser().getCity().equals(order.getUser().getCity())) {
                list.add(order);
            }
       }

    }
}



