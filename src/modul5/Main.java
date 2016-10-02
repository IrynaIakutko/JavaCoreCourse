package modul5;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Controller controller = new Controller();
        API[] api1=controller.getApis();

        Room[] room1;
        Room[] room2;
        Room[] room3;
     //   Room[] room4;
        Room[] room5;


        DAOimpl daOimpl=new DAOimpl();

        Room[] room= controller.requestRooms(2900, 4, "New Hotel","Krakov" );

        for(int i=0;i<room.length;i++)
        {daOimpl.save(room[i]);}

       room1=controller.requestRooms(300, 3 , "Warsaw", "Sofitel Warsaw Victoria");
        for(Room k : room1)
        {daOimpl.save(k);}
        room2=controller.requestRooms(555, 4, "Paris","Hotel Panache");
        for(Room k : room2)
        {daOimpl.save(k);}
       room3= controller.check(api1[1],api1[2]);
        for(int i=0;i<room3.length;i++)
        {daOimpl.save(room3[i]);}
     Room[] room4= controller.check(api1[1],api1[0]);
        for(int i=0;i<room4.length;i++)
        {daOimpl.save(room4[i]);}
        room5= controller.check(api1[2],api1[0]);
        for(int i=0;i<room5.length;i++)
        {daOimpl.save(room5[i]);}




    }
}

