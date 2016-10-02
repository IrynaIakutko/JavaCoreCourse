package modul6;


import java.util.Objects;

public class User {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                salary == user.salary &&
                balance == user.balance &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, salary, balance);
    }

    private long  id ;
    private String firstName;
    private String lastName;
    private int salary;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSalary() {

        return salary;
    }

    public long getId() {

        return id;
    }

    public int getBalance() {

        return balance;
    }

    private int balance;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", balance=" + balance +
                '}';
    }

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }
}
