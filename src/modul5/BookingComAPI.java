package modul5;


import java.util.Date;

public class BookingComAPI implements API {

    private Room[] rooms;


    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {

        return rooms;
    }

    public BookingComAPI() {

        rooms=new Room[5];
//2900, 4, "Krakov","New Hotel"

        rooms[0] = new Room(13,1200,2,new Date(),"New Hotel1","Colorado");
        rooms[1] = new Room(12,2900,4,new Date(),"New Hotel","Krakov");
        rooms[2] = new Room(14,2000,2,new Date(),"New Hotel3","Warsaw");
        rooms[3] = new Room(13,13200,2,new Date(),"Gavana2","Mexico");
        rooms[4]   = new Room(13,1200,2,new Date(),"Gavana","Mexico");

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
