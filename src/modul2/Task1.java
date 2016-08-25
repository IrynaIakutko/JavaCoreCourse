package modul2;

/**
 * Created by Lenovo on 25.08.2016.
 */
public class Task1 {
    static int sumint(int[] array) {
        int sum = 0;
        int item = 0;

         do {
            sum+=array[item];
             item++;
         } while (item<array.length);
        return sum;
    }
    static int aminint(int[] array) {
        int minint = array[0];
        int item = 1;

        while (item<array.length){
            if( minint>array[item]) {
                minint = array[item];
            }
            item++;
        }
        return minint;
    }
    static int amaxint(int[] array) {
        int maxint = array[0];
        int item = 1;

        while (item<array.length){
            if( maxint<array[item]) {
                maxint = array[item];
            }
            item++;
        }
        return maxint;
    }
    static int amaxintPositiv(int[] array) {
        int maxintP = -1;
        int item = 0;

        while (item<array.length){
            if( maxintP<array[item])&(array[item]>=0) {
                maxintP = array[item];
            }
            item++;
        }
        return maxintP;
    }
    static double sumdb(double[] array) {
        double sum = 0;
        int item = 0;

        do {
            sum+=array[item];
            item++;
        } while (item<array.length);
        return sum;
    }

    static double amindouble(double[] array) {
        double mindouble = array[0];
        int item = 1;

        while (item<array.length){
            if( mindouble>array[item]) {
                mindouble = array[item];
            }
            item++;
        }
        return mindouble;
    }
    static double amaxdouble(double[] array) {
        double maxdouble = array[0];
        int item = 1;

        while (item<array.length){
            if( maxdouble<array[item]) {
                maxdouble = array[item];
            }
            item++;
        }
        return maxdouble;
    }
    static double amaxdoublePositiv(double[] array) {
        double maxdoubleP = -1;
        int item = 0;

        while (item<array.length){
            if( maxdoubleP<array[item])&(array[item]>=0) {
                maxdoubleP = array[item];
            }
            item++;
        }

        return maxdoubleP;
    }

    public static void main(String[] args) {
        int sumaint;
        int minaint;
        int maxaint;
        int maxaintP ;
        double sumadb;
        double minadouble;
        double maxadouble;
        int[] arraint = {-66,1200, 250,7, -2000, -500,4, 3200,15,2};
        double [] arraydb = {66.35,-1200.45,- 250.12,7.3, 2000.6, -500,4.5, -3200.9,154.5,2.3};
        sumaint=sumint(arraint);
        System.out.println("sum int ="+sumaint);
        sumadb=sumdb(arraydb);
        System.out.println("sum double="+ sumadb);
        minaint=aminint(arraint);
        System.out.println("min int="+ minaint);
        maxaint=amaxint(arraint);
        System.out.println("max int="+ maxaint);
        minadouble=amindouble(arraydb);
       maxaintP = amaxintPositiv(arraydb);
        System.out.println("max int Positiv="+ maxaintP);


        System.out.println("min double="+ minadouble);
        maxadouble=amaxdouble(arraydb);
        System.out.println("max double="+ maxadouble);

        System.out.println("Ssum \n" +
                "min/max\n" +
                "max positive\n" +
                "multiplication  \n" +
                "modulus of first and last element\n" +
                "second largest element\n"+ maxaint);





    }



}
