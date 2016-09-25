package modul5;


import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room[] rooms;


    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {

        return rooms;
    }

    public TripAdvisorAPI() {

        rooms=new Room[5];

        rooms[0] = new Room(1, 2900, 4, new Date(), "New Hotel", "Krakov");
        rooms[1] = new Room(2, 3400, 5, new Date(), "Monaco citi", "Monaco");
        rooms[2] = new Room(5, 2300, 3, new Date(), "Lastol", "Berlin");
        rooms[3] = new Room(10, 34000, 1, new Date(), "Hotel ", "Warsaw");
        rooms[4] = new Room(11, 1030, 3, new Date(), "Bereza", "Moscow");

    }



    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room findR = new Room(0, price, persons, new Date(), city, hotel);
        int count = 0;
        for (Room n : rooms) {
            if (findR.equals(n)) {
                count++;
            }
        }
        int r = 0;
        Room[] result = new Room[count];

        for (Room k : rooms ) {
            if (findR.equals(k)) {
                result[r] = k;
                r++;
            }
        }

        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
