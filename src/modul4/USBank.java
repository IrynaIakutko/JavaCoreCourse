package modul4;


public class USBank extends Bank {


    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    public int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;

    }

    @Override
    public int getLimitOfFunding() {
        int founding;
 //  switch (getCurrency()){
       //     case Currency.EUR: founding=1000;
      //      case Currency.USD:founding=0;
// Так правильней.Т.к. валюты могут добавляться. Но не нолучилось.
       // }
        //  limit of funding - 10000 if EUR and no limit if USD

        if (getCurrency() == Currency.EUR) founding = 1000;
             else founding = 0;
        return founding;
    }

    @Override
    public int getMonthlyRate() {
        //monthly rate - 1% with USD and 2% with EUR
        int  MonthlyRate;
          if (getCurrency() == Currency.EUR) MonthlyRate = 2;
            else MonthlyRate= 1;

        return MonthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        //  commision - 5% if USD and up to 1000, 7% if USD and more than 1000
        //  6% if EUR and up to 1000 and 8% if EUR and more than 1000 - ошибка в  getCommission -1s
        int commision;
            if (getCurrency() == Currency.USD) {
                if (summ < 1000) commision = 5;
                else commision = 7;
             }
             else if (summ < 1000)
                 commision = 6;
                     else commision = 8;
        return commision;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
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
