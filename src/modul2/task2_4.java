package modul2;


public class task2_4 {

        static   double tk2_4(  int[] balances,String[] ownerNames,String ownerName, double  fund ){
            int si=-1;
            double newBalanc;
            for (int i = 0; i < balances.length; i++) {
                if( ownerNames[i]==ownerName){
                    si=i;
                }
            }
            if (si==-1) {System.out.println(" No owner");
                newBalanc=-1;}else{
            newBalanc= balances[si] +fund;
            System.out.println(ownerName+"   "+ newBalanc );
                        }
            return newBalanc;

        }

        public static void  main(String[] args) {
            int[] balances = {1200, 250, 2000, 500, 3200};
            String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
            double r= tk2_4(balances,ownerNames,"Ann",300 );
            r= tk2_4(balances,ownerNames,"Oww",100 );
            r= tk2_4(balances,ownerNames,"Enn",100 );
            System.out.println(r+ " Enn");
        }

    }

