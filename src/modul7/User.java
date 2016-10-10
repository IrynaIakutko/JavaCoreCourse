package modul7;

public class User {
   public long getId() {
      return id;
   }
   private long id;
   private String firstName;
   private String lastName;
   private String city;
   private int balance;

   public String getCity() {

      return city;
   }

   public User(long id, String firstName, String lastName, String city, int balance) {

      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.city = city;
      this.balance = balance;
   }


   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", city='" + city + '\'' +
              ", balance=" + balance +
              '}';
   }

   public String getLastName() {
      return lastName;
   }
}
