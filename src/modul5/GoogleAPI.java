package modul5;


public class GoogleAPI implements API {
    private Room rooms[];

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {

        return rooms;
    }

    public GoogleAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
