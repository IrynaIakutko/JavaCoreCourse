package modul5;


public interface API {
    public Room[] findRooms(int price, int persons, String city, String hotel);
   public Room[] getAll();
}

