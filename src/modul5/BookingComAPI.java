package modul5;


public class BookingComAPI implements API {
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {

        return rooms;
    }

    private Room rooms[];
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }
}
