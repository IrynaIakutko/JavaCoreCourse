package modul7;

import java.util.Objects;

public class Order implements Comparable<Order>{
    private long id;
    private int price;
    private Currency currency;
    private String shopIdentificator;
    private User user;
    private String itemName;

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public String getItemName() {

        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setUser(User user) {

        this.user = user;
    }

    public void setShopIdentificator(String shopIdentificator) {

        this.shopIdentificator = shopIdentificator;
    }

    public void setCurrency(Currency currency) {

        this.currency = currency;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public long getId() {

        return id;
    }

    public User getUser() {

        return user;
    }

    public int getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {

        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }



    public Currency getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id &&
                price == order.price &&
                currency == order.currency &&
                Objects.equals(itemName, order.itemName) &&
                Objects.equals(shopIdentificator, order.shopIdentificator) &&
                Objects.equals(user, order.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, currency, itemName, shopIdentificator, user);
    }


    @Override
    public int compareTo(Order o) {
        return this.price - o.getPrice();
    }
}
