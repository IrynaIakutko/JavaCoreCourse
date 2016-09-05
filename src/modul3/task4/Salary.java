package modul3.task4;


public class Salary {
    public static void main(String[] args) {
        User user1 = new User("Sonya", 2000, 3, "Teki", 15000, "grn");
        String name = user1.getName();
        int balance=user1.getBalance();
        System.out.println("balance" + name + balance);
        user1.paySalary();
        balance=user1.getBalance();
        System.out.println("balance+ salary" + name + balance);

        user1.withdraw(1000);
        balance=user1.getBalance();
        System.out.println("balance-withdraw(1000)" + name + balance);

        String comp = user1.getCompanyName();
        int lcomp=user1.companyNameLenfht();
        System.out.println("lenght company name" + comp + lcomp);

        int month =user1.getMonthsOfEmployment();
        System.out.println("MonthsOfEmployment" +month);
        user1.monthIncreaser(3);
        int month =user1.getMonthsOfEmployment();
        System.out.println("MonthsOfEmployment+3" +month);






    }
}
