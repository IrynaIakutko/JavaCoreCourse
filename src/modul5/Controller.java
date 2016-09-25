package modul5;


import java.util.Date;

public class Controller {
    private API[] apis = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};


    public API[] getApis() {
        return apis;
    }

    public Controller() {
        // API[] apis =
        // this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (API n : apis) {
            count += n.findRooms(price, persons, city, hotel).length;
        }
        Room[] allRooms = new Room[count];
        if (count != 0) {
            int c = 0;
            for (API z : apis) {
                for (Room x : z.findRooms(price, persons, city, hotel)) {
                    allRooms[c] = x;
                    c++;
                }
            }
        }
        return allRooms;
    }


    public Room[] check(API api1, API api2) {
        Room[] roAp1 = api1.getAll();
        Room[] roAp2 = api2.getAll();
        int i1 = roAp1.length;
        i1 = i1 + roAp2.length;
        Room[] roomCheck = new Room[i1]; //add

        System.arraycopy(roAp1, 0, roomCheck, 0, roAp1.length);

        System.arraycopy(roAp2, 0, roomCheck, roAp1.length, roAp2.length);
        int kNull = 0;
       // rooms[0] = new Room(1, 2900, 4, new Date(), "New Hotel", "Krakov");
        Room a=new Room(-1,-1,-1,new Date(), "", "");
        for (int k = 0; k < roomCheck.length-1; k++) {
            for (int l = k + 1; l < roomCheck.length-2; l++) {

                if (roomCheck[k].equals(roomCheck[l])) {
                    kNull++;
                    roomCheck[k] = a;
                }
            }
        }
        Room[] rez = new Room[i1 - kNull];
        int r = 0;
        for (Room n : roomCheck) {
            if (!(n.equals(a))) {
                rez[r] = n;
                r++;
            }
        }
        return rez;
    }
}



