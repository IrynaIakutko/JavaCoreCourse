package modul5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Controller controller = new Controller();
        API[] api1=controller.getApis();


        DAOimpl daOimpl=new DAOimpl();
//API bookingApi =
        Room[] room= controller.requestRooms(2900, 4, "New Hotel","Krakov" );

        for(int i=0;i<room.length;i++)
        {daOimpl.save(room[i]);}

       room=controller.requestRooms(300, 3 , "Warsaw", "Sofitel Warsaw Victoria");
        for(Room k : room)
        {daOimpl.save(k);}
        room=controller.requestRooms(555, 4, "Paris","Hotel Panache");
        for(Room k : room)
        {daOimpl.save(k);}
       room= controller.check(api1[1],api1[2]);
        for(int i=0;i<room.length;i++)
        {daOimpl.save(room[i]);}




    }
}

