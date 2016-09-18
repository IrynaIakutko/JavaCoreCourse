package modul5;


public class TripAdvisorAPI implements API {
    private Room rooms[];

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {

        return rooms;
    }

    public TripAdvisorAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    public TripAdvisorAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
