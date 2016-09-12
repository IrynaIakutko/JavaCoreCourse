package modul4;

/**
 * Created by Lenovo on 12.09.2016.
 */
public class ChinaBank extends Bank {
    @Override
    public int getLimitOfWithdrawal() {
// limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
            int limit;
            if (getCurrency() == Currency.USD) limit = 100;
            else limit = 150;
        return limit;
    }

    @Override
    public int getLimitOfFunding() {
                //limit of funding - 5000 if EUR and 10000 if USD
        int founding;
            if (getCurrency() == Currency.EUR) founding = 5000;
            else founding = 10000;
        return founding;
    }

    @Override
    public int getMonthlyRate() {
        // monthly rate - 1% with USD and 0% with EUR


        int  MonthlyRate;
        if (getCurrency() == Currency.EUR) MonthlyRate = 1;
        else MonthlyRate= 0;

        return MonthlyRate;

    }

    @Override
    public int getCommission(int summ) {
       // commision - 3% if USD and up to 1000, 5% if USD and more than 1000
        //10% if EUR and up to 1000 and 11% if EUR and more than 1000
        int commision;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) commision = 3;
            else commision = 5;
        }
        else if (summ < 1000)
            commision = 10;
        else commision = 11;
        return commision;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
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
