package modul5;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Date;


public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        if (!(room==null))
        System.out.println(room.toString()+"save");

        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString()+"delete");
        return false;
    }



    @Override
    public Room update(Room room) {
        System.out.println(room.toString()+"update");
        return null;
    }

    @Override
    public Room findById(long id) {
Room room = new Room(14,3700,4, new Date(), "Hotel ", "Donezk");
        System.out.println(id +room.toString()+"find");
        return null;
    }
}

