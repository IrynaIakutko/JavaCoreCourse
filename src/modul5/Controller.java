package modul5;


public class Controller {

    API apis[];

    public Controller(API a1,API a2,API a3) {

        apis = new API[3];
        apis[0]=a1;
        apis[1]= a2;
        apis[2]=a3;


    }


    Room[] requstRooms(int price, int persons, String city, String hotel) {
      Room[]rooms1;
        int item=0;
        int i=0 ;
        do {
            for (Room room : rooms1 = apis[item].findRooms(price, persons, city, hotel)) {

            }
            ;
           // for(i=0,apis[item], apis[item].findRooms(price,persons,city,hotel);

        } while (item<2);
        return rooms1;

    };
    private int check(API api1, API api2){
        int i;
        i=1;
        return i;
    }
}
