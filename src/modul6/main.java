package modul6;


import static modul6.UserUtils.*;
//import static modul6.UserUtils.usersWithContitionalBalance;

public class main {
    public static void main(String[] args) {
        User user0= new User(12,"Ivanov","Vasya",2500,3000);
        User user1= new User(13,"Ivanov1","Vasya5",5500,4000);
        User user2= new User(12,"Ivanov","Vasya",2500,3000);
        User user3= new User(15,"Ivanov3","Vasya4",2100,6000);
        User user4= new User(16,"Ivanov4","Vasya3",2300,7000);
        User user5= new User(17,"Ivanov5","Vasya2",4500,4000);
        User user6= new User(18,"Ivanov6","Vasya1",7500,9000);
        User[] users={user0,user1,user2,user3,user4,user5,user6};
        User[] rez1;
        rez1=(uniqueUsers(users));
        System.out.println("uniqueUsers");
        for (int i= 0;i<rez1.length;i++){
            System.out.println(rez1[i].toString());
        }
        User[] rez2;
        rez2=(usersWithContitionalBalance(users,4000));
        System.out.println("usersWithContitionalBalance");
        for (int i= 0;i<rez2.length;i++){
            System.out.println(rez2[i].toString());
        }
        System.out.println("users");
        int n=users.length;
       //for (int i= 0;i<users.length;i++)
         //   System.out.println(users[i].toString());
       // User[] users1;
       //         users1= (paySalaryToUsers(users));
       // System.out.println("paySalaryToUsers");
       // for (int i= 0;i<users.length;i++){
       //     System.out.println(users[i].toString());
        //}
      //  long[] arrayL = new long[n];

     //   arrayL=getUsersId(users);
       // for (int i= 0;i<rez2.length;i++){
      //      System.out.println(arrayL[i]);
      //  }


    }

}
