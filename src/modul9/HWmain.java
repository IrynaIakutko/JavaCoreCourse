package modul9;

import modul7.Currency;
import modul7.Order;
import modul7.User;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.*;

public class HWmain {
    public static void main(String[] args) {
        User user1 = new User(011, "Pechkur1", "Vanya1", "Lvov", 1500);
        User user2 = new User(012, "Pechkur2", "Vanya2", "Lvov8", 3500);
        User user4 = new User(011, "Pechkur4", "Vanya4", "Lvov3", 6500);
        User user5 = new User(041, "Pechkur5", "Vanya5", "Lvov5", 8500);
        User user6 = new User(051, "Pechkur6", "Vanya6", "Lvov", 11500);
        List<Order> list = new ArrayList<>();
        list.add(new Order(122, 3500, Currency.UAH, "платье", "простор", user2));
        list.add(new Order(122, 400, Currency.UAH, "платье", "простор", user2));
        list.add(new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5));
        list.add(new Order(124, 450, Currency.UAH, "туфли", "виртус", user4));
        list.add(new Order(125, 770, Currency.USD, "носки", "сильпо", user5));
        list.add(new Order(126, 890, Currency.UAH, "варешки", "привоз", user6));
        list.add(new Order(124, 450, Currency.UAH, "туфли", "виртус", user4));
        list.add(new Order(129, 356, Currency.USD, "зюкзак", "Eva", user5));
        list.add(new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1));
        list.add(new Order(120, 564, Currency.USD, "ШОРТЫ2", "виртус", user1));

        out.println("************************* list /n");
        // Stream<Order> streamFromlist = list.stream();
        //streamFromlist.forEach(System.out::println);
        list.forEach(out::println);
        out.println("************************* sort list by Order price in decrease order  \n");
        list.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
        Stream<Order> streamFromlist1 = list.stream();
        streamFromlist1.forEach(out::println);
        out.println("************************* sort list by Order price in increase order AND User city  \n");
        list.sort((o1, o2) -> {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0) result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        });
        Stream<Order> streamFromlist2 = list.stream();
        streamFromlist2.forEach(out::println);

        out.println("************************* sort list by Order itemName AND ShopIdentificator AND User city \n ");
        list.stream().sorted((o1, o2) -> {
            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result == 0) {
                result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            }
            ;
            if (result == 0) {
                result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        });
        list.forEach(out::println);
        out.println("************************* delete duplicates from the list \n ");
        list = list.stream().distinct().collect(Collectors.toList());
        list.forEach(out::println);


        out.println("************************* delete items where price less than 1500 \n ");
        list = list.stream().filter(o1 -> o1.getPrice() > 1500).collect(Collectors.toList());
        list.forEach(out::println);

        out.println("*************************separate list for two list - orders in USD and UAH \n ");
        List listUSD = list.stream().filter(o1 -> o1.getCurrency() == Currency.USD).collect(Collectors.toList());
        listUSD.forEach(out::println);
        List listUAH = list.stream().filter(o1 -> o1.getCurrency() == Currency.UAH).collect(Collectors.toList());
        listUAH.forEach(out::println);




        out.println("************************* separate list for as many lists as many unique cities are in User \n "+sepListCities(list));

    }


    private static Map<String, List<Order>> sepListCities(List<Order> orders) {
        Map<String, List<Order>> result = new HashMap<>();
        Function<Order, String> getCity = s -> s.getUser().getCity();
        orders.stream().forEach(s -> {
            if (!result.containsKey(getCity.apply(s))) {
                result.put(getCity.apply(s), new ArrayList<Order>());
            }
            result.get(getCity.apply(s)).add(s);
        });
        return result;
    }
}

