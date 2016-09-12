package modul4;

/**
 * Created by Lenovo on 12.09.2016.
 */
public class EUBank extends  Bank {
    @Override
    public int getLimitOfWithdrawal() {
        //limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
        int limit;
            if (getCurrency() == Currency.USD) limit = 2000;
            else limit = 2200;
        return limit;
            }

    @Override
    public int getLimitOfFunding() {
        int founding;
       // limit of funding - 20000 if EUR and 10000 if USD
        if (getCurrency() == Currency.EUR) founding = 20000;
        else founding = 10000;
        return founding;
    }

    @Override
    public int getMonthlyRate() {
       // monthly rate - 0% with USD and 1% with EUR
        int  MonthlyRate;
        if (getCurrency() == Currency.EUR) MonthlyRate = 0;
        else MonthlyRate= 1;

        return MonthlyRate;
    }

    @Override
    public int getCommission(int summ) {
      //  commision - 5% if USD and up to 1000, 7% if USD and more than 1000
      //  2% if EUR and up to 1000 and 4% if EUR and more than 1000

        int commision;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commision = 5;
            else commision = 7;
        }
        else if (summ < 1000)
            commision = 2;
        else commision = 4;
        return commision;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public void setTotalCapital(long totalCapital) {
        super.setTotalCapital(totalCapital);
    }

    @Override
    public void setRating(long rating) {
        super.setRating(rating);
    }

    @Override
    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        super.setAvrSalaryOfEmployee(avrSalaryOfEmployee);
    }

    @Override
    public void setNumberOfEmployees(int numberOfEmployees) {
        super.setNumberOfEmployees(numberOfEmployees);
    }

    @Override
    public void setCurrency(Currency currency) {
        super.setCurrency(currency);
    }

    @Override
    public void setBankCountry(String bankCountry) {
        super.setBankCountry(bankCountry);
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getTotalCapital() {
        return super.getTotalCapital();
    }

    @Override
    public long getRating() {
        return super.getRating();
    }

    @Override
    public double getAvrSalaryOfEmployee() {
        return super.getAvrSalaryOfEmployee();
    }

    @Override
    public int getNumberOfEmployees() {
        return super.getNumberOfEmployees();
    }

    @Override
    public Currency getCurrency() {
        return super.getCurrency();
    }

    @Override
    public String getBankCountry() {
        return super.getBankCountry();
    }

    @Override
    public long getId() {
        return super.getId();
    }
}
