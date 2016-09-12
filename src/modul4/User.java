package modul4;

public class User {
private long id;
private String name;
private double balance;
private int monthsOfEmployment;
private String companyName;
private int salary;
private Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {

        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setId(long id) {

        this.id = id;
    }

    public Bank getBank() {

        return bank;
    }

    public int getSalary() {

        return salary;
    }

    public String getCompanyName() {

        return companyName;
    }

    public int getMonthsOfEmployment() {

        return monthsOfEmployment;
    }

    public double getBalance() {

        return balance;
    }

    public String getName() {

        return name;
    }

    public long getId() {

        return id;
    }

    public User(int id, String ivan, double balance, int monthsOfEmployment, String ooo1, int salary, Object p6) {
    }

    @Override

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
