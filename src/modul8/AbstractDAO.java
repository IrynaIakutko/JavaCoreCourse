package modul8;


import java.util.List;

public interface AbstractDAO <T>{
    T save (T t);
    void delete(T t);
    void deleteAll(List<User> t);
    void saveAll(List<User> t);
    List <T> getList();
    void deleteById(long id);
    T get(long id);

}
