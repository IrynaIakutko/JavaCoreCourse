package modul2;


public class task2_2 {
    static  double tk2_2(double balance, double  withdraws ){
        double commision = withdraws*0.05;
        double newbalance=balance-withdraws-commision;
        if (newbalance>0){
            System.out.println("OK "+ commision+"  "+ newbalance);
        }  else {
            System.out.println("NO");

        }
        return  newbalance;
    }

    public static void main(String[] args) {
        tk2_2(200.6 ,20);
        tk2_2(100,99);
    }
}
