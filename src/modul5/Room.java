package modul5;
import java.util.Date;
import java.util.Objects;

public class Room {
   private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
   private String hotelName;
    private String cityName;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Room room = (Room) o;
            return price == room.price &&
                    persons == room.persons &&
                    Objects.equals(cityName, room.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, persons, cityName);
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setHotelName(String hotelName) {

        this.hotelName = hotelName;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {

        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setPersons(int persons) {

        this.persons = persons;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getCityName() {

        return cityName;
    }

    public String getHotelName() {

        return hotelName;
    }

    public Date getDateAvailableFrom() {

        return dateAvailableFrom;
    }

    public int getPersons() {

        return persons;
    }

    public int getPrice() {

        return price;
    }

    public long getId() {

        return id;
    }

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {

        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }
}
