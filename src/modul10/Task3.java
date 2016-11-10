import modul8.User;

public class Task3 {
    public static void main(String[] args) {
        User user = null;
        try{
            user.getId();
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

    }

}
