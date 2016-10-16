package modul8;

import java.util.ArrayList;
import java.util.List;

public class MainTest extends AbDAOImpl {
    public MainTest(List listBD) {
        super(listBD);
    }

    public static void main(String[] args) {
        User user1 = new User(01, "Vanya1");
        User user2 = new User(02, "Vanya2");
        User user4 = new User(04, "Vanya4");
        User user5 = new User(05, "Vanya5");
        User user6 = new User(06, "Vanya6");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user5);
        list.add(user6);
        list.add(user4);
        System.out.println("************************* list /n");
        System.out.println(list);
        AbDAOImpl<User> dao = new AbDAOImpl<>(list);
        User save = dao.save(user2);
        System.out.println("************************* dao.save(user2) /n");
        System.out.println(save);
        System.out.println("************************* dao.getList() /n");
        System.out.println(dao.getList());

       dao.saveAll(list);
        System.out.println("*************************  dao.saveAll(list) /n");
        System.out.println(dao.getList());

        dao.delete(user1);
        System.out.println("*************************  dao.delete(user1); /n");
        System.out.println(dao.getList());

        dao.deleteAll(list);
        System.out.println("*************************  dao.deleteAll(list);; /n");
        System.out.println(dao.getList());
    }


}
