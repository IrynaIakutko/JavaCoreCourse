package modul5;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 * Created by Lenovo on 15.09.2016.
 */
public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
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

        System.out.println(id +"find");
        return null;
    }
}
