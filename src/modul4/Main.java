package modul4;

public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank(1001,"USA",Currency.USD,1200,3000,145,10000000);
        Bank dbBank = new EUBank(1002,"Germany",Currency.USD,1500,4000,95,20000000);
        Bank chBank = new ChinaBank(1009,"China",Currency.USD,12000,1300,45,90000000);
        Bank dbBanke = new EUBank(1002,"Germany",Currency.EUR,3500,4000,343,8000000);
        Bank usBanke = new USBank(1002,"USA",Currency.EUR,6500,4000,595,700000);
        Bank chBanke = new ChinaBank(1002,"China",Currency.EUR,7500,4000,995,300000);

        User ivUser = new User((long) 101,"Ivan",1000,3000,"OOO1",3000,dbBank);
        User urUser = new User((long)102,"Uriy",14000.80,3000,"OOO3",3000,dbBanke);
        User koUser = new User((long)103,"Kostya",610050.80,3000,"OOO4",3000,usBank);
        User ruUser = new User((long)104,"Ruslan",1545.60,3000,"OOO6",3000,usBanke);
        User naUser = new User((long)105,"Nata",1055.10,3000,"OOO8",3000,chBank);
        User cvUser = new User((long)106,"Sveta",7055.10,3000,"OOOt",3000,chBanke);
        BankSystem bankSystem=new BankSystemImpl();
        System.out.println(koUser);
        System.out.println("withdrawOfUser,10000");
        bankSystem.withdrawOfUser(koUser,10000);
        System.out.println(koUser);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(ruUser);
        System.out.println("withdrawOfUser,2000");
        bankSystem.withdrawOfUser(ruUser,2000);
        System.out.println(ruUser);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(urUser);
        bankSystem.fundUser(urUser,500);
        System.out.println("fund 500");
        System.out.println(urUser);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(cvUser);
        bankSystem.fundUser(cvUser,6000);
        System.out.println("fund 6000");
        System.out.println(cvUser);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(ivUser+"to"+koUser+"500");
        bankSystem.transferMoney(ivUser,koUser, 500);
        System.out.println("after transfer"+ivUser+"to"+koUser+"500");
        System.out.println("_________________________________________________________________________________________");
        System.out.println(naUser+"to"+ruUser+"900");
        bankSystem.transferMoney(naUser,ruUser, 900);
        System.out.println("after transfer"+naUser+"to"+ruUser+"900");
        System.out.println("_________________________________________________________________________________________");
        System.out.println(naUser+ "paySalary");
        bankSystem.paySalary(naUser);
        System.out.println(naUser);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(ivUser+ "paySalary");
        bankSystem.paySalary(ivUser);
        System.out.println(ivUser);
        System.out.println("_________________________________________________________________________________________");









    }
}
