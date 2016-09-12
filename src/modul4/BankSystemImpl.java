package modul4;

public class BankSystemImpl implements BankSystem {
    public BankSystemImpl() {
    }

    @Override

    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();

        double commission;
        commission = userBank.getCommission(amount)/100;
        if (user.getBalance() >= (amount + amount * commission)) {
            double newBalance = user.getBalance() - amount - amount * commission;
            user.setBalance(newBalance);
        } else System.out.println("withdrawOfUser back out");
    }



    @Override
    public void fundUser(User user, int amount) {
        Bank userBank= user.getBank();
       if( userBank.getLimitOfFunding()<amount )
            System.out.println("fundUser back out");
        else{
            double newBalance=user.getBalance()+amount;
        user.setBalance(newBalance);}


        }


    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double newBalance;
        double fromUserOld;
        Bank fromUserBank =fromUser.getBank();
        Bank toUserBank =toUser.getBank();
        if(fromUserBank.getCurrency()==toUserBank.getCurrency()){
        fromUserOld=fromUser.getBalance();
        withdrawOfUser(fromUser,amount);
        if (fromUserOld>fromUser.getBalance()){
         newBalance=toUser.getBalance()+amount;
        toUser.setBalance(newBalance);}
        else System.out.println("transferMoney back out");}
        else System.out.println("transferMoney back out because Currencys are disagree");
             }

    @Override
    public void paySalary(User user) {
        double newBalance= user.getBalance()+user.getSalary();
        user.setBalance(newBalance);

    }
}
