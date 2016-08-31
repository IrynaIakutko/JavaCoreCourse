package modul2;


public class task2_3 {
    static   double tk2_3(  int[] balances,String[] ownerNames,String ownerName, double withdrawal ){
        int si=-1;
        double newBalanc=-1;
        for (int i = 0; i < balances.length; i++) {
            if( ownerNames[i]==ownerName){
                si=i;
            }
        }
        if (si== -1) {System.out.println(" No owner");
            newBalanc=-1;}
        newBalanc= balances[si]- withdrawal-withdrawal*0.05;
        if (newBalanc>=0){
            System.out.println(ownerName+"   "+withdrawal+"  "+newBalanc );
        }else {
            System.out.println(ownerName+"   NO" );
        }
return newBalanc;

    }

    public static void  main(String[] args) {
       int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double r= tk2_3(balances,ownerNames,"Ann",100 );
        r= tk2_3(balances,ownerNames,"Oww",490 );
    }

}
