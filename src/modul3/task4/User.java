package modul3.task4;


public class User {
    String name;
    int balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    String currency;

   public  void withdraw(int summ){
       double balance;
       if (summ < 1000)
         balance=this.balance-summ-summ*0.05;
          balance=this.balance-summ-summ*0.1;
       this.balance=(int)balance;
     }
   public int companyNameLenfht(){
       int a =this.companyName.length();
       return  a;
   }
    public  void monthIncreaser(int addMonth){
        this.monthsOfEmployment=this.monthsOfEmployment +addMonth;
    }
    public   void paySalary(){
        this.balance=this.balance+this.salary;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
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

    public void setBalance(int balance) {

        this.balance = balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCurrency() {

        return currency;
    }

    public int getSalary() {

        return salary;
    }

    public String getCompanyName() {

        return companyName;
    }

    public int getBalance() {

        return balance;
    }

    public int getMonthsOfEmployment() {

        return monthsOfEmployment;
    }

    public String getName() {

        return name;
    }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {

        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;

    }

        }
