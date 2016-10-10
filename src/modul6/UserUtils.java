package modul6;

public class UserUtils {
   public static User[] uniqueUsers(User[] users) {
       int n = users.length;
       int c = 0;

       for (int i = 0; i < n; i++) {
           for (int l = i + 1; l < n; l++) {
               if (users[l].equals(users[i])) {
                   users[i] = null;
                   c++;
               }
           }


       }
       User[] arrayRez;
       arrayRez = deleteEmptyUsers(users);
       return arrayRez;
   }

   public static User[] usersWithContitionalBalance(User[] users, int balance){
      int n=users.length;
     User[]arrayRez;
       int c=0;
       for (int i=1;i<n;i++) {
           if (!(users[i].getBalance() == balance)) {
               users[i] = null;
           }
       }
        return deleteEmptyUsers(users);
       }

    public static User[] paySalaryToUsers(User[] users) {
        int n= users.length;
        int a;
        int b;
        User[] users1=new User[n];
        for (int i = 0; i < n; i++) {
        a=    users[i].getBalance();
         b=   users[i].getSalary();
            users1[i].setBalance(a+b);
        }
        return users1;
    }
    public static long[] getUsersId(User[] users){
        int n= users.length;
        long a;
        long[]arrayRez= new long[n];
        for (int i=0; i<n;i++) {
            a = users[i].getId();
            arrayRez[i] = a;
        }
        return  arrayRez;
    }
    public static User[] deleteEmptyUsers(User[] users){
      int n=users.length;
        int c=0;
        for (int i = 0; i < n; i++) {
            if (users[i]==null)  c++;
        }
        User[] arrayRez=new User[n-c];
        int l=0;
        for (int i = 0; i < n; i++) {
            if (!(users[i]==null)) {
                arrayRez[l] = users[i];
                l++;
            }
            }
        return arrayRez;
    }

    }




//}
