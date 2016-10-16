package modul8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AbDAOImpl<T>implements AbstractDAO<T> {
    private List<T> listBD;

    public AbDAOImpl(List<T> listBD) {
        this.listBD = listBD;
    }

    public AbDAOImpl() {

    }


    @Override
    public T save(T t) {
        listBD.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        listBD.remove(t);

    }

    @Override
    public void deleteAll(List<User> t) {
        int i = 0;
        while (listBD.size() > i) {

            int j = 0;
            while (t.size() > j) {
                if (listBD.get(i).equals(t.get(j))) {
                    listBD.remove(listBD.get(i));
                }
                j++;
            }i++;
        }
    };

     @Override
    public void saveAll(List<User> t) {


         listBD.addAll((Collection<? extends T>) t);
    };


    @Override
    public List<T> getList() {
        ArrayList<T> newList= new ArrayList<T>();
        int i = 0;
        while (listBD.size() > i){
            newList.add(listBD.get(i));
            i++;
        }
        return newList;
    };


}
