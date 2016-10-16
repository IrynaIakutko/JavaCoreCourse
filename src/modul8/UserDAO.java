package modul8;


import java.util.List;

public class UserDAO extends  AbDAOImpl<User> {
    public UserDAO(List<User> list){
        super();
        super.getList();
    }
    public User save(User user){
        save(user);
        return user;
    };
    public void delete(User user){
        delete(user);
    };
    public void deleteById(long id){
        deleteById(id);
    };
    public User get(long id){
       return get(id);
    };
}
