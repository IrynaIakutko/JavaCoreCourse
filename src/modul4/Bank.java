package modul4;



abstract class Bank {

   private long id;
   private String bankCountry;
   private Currency  currency ;
   private int numberOfEmployees;
   private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;
   public abstract int getLimitOfWithdrawal();
   public abstract int getLimitOfFunding();
    public abstract int getMonthlyRate();
 public abstract int getCommission(int summ);

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                ", numberOfEmployees=" + numberOfEmployees +
                ", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                ", rating=" + rating +
                ", totalCapital=" + totalCapital +
                '}';
    }

    public double moneyPaidMonthlyForSalary(){
return (this.numberOfEmployees*this.avrSalaryOfEmployee);
   };

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployees = numberOfEmployees;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    public void setRating(long rating) {

        this.rating = rating;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {

        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {

        this.numberOfEmployees = numberOfEmployees;
    }

    public void setCurrency(Currency currency) {

        this.currency = currency;
    }

    public void setBankCountry(String bankCountry) {

        this.bankCountry = bankCountry;
    }

    public void setId(long id) {

        this.id = id;
    }

    public long getTotalCapital() {

        return totalCapital;
    }

    public long getRating() {

        return rating;
    }

    public double getAvrSalaryOfEmployee() {

        return avrSalaryOfEmployee;
    }

    public int getNumberOfEmployees() {

        return numberOfEmployees;
    }

    public Currency getCurrency() {

        return currency;
    }

    public String getBankCountry() {

        return bankCountry;
    }

    public long getId() {

        return id;
    }
}
