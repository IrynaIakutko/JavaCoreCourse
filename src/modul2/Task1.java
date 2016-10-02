package modul2;
import modul6.ArraysUtils.*;


public class Task1 {
    static int sum(int[] array) {
        int sum = 0;
        int item = 0;

         do {
            sum+=array[item];
             item++;
         } while (item<array.length);
        return sum;
    }
    static int min(int[] array) {
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
    static int max(int[] array) {
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
    static int maxPositive(int[] array) {
        int maxintP = -1;
        int item = 0;

        while (item<array.length){
            if(( maxintP<array[item])&(array[item]>=0)) {
                maxintP = array[item];
            }
            item++;
        }
        return maxintP;
    }
    static double sum(double[] array) {
        double sum = 0;
        int item = 0;

        do {
            sum+=array[item];
            item++;
        } while (item<array.length);
        return sum;
    }

    static double min(double[] array) {
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
    static double max(double[] array) {
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
    static double maxPositive(double[] array) {
        double maxdoubleP = array[0];
        int item = 1;

        while (item<array.length){
            if(( maxdoubleP<array[item])&(array[item]>=0)) {
                maxdoubleP = array[item];
            }
            item++;
        }

        return maxdoubleP;

    }
    static int multiplication(int[] array)    {
        int m = 1;
              for (int i = 0; i < array.length; i++) {
                                m=m*array[i];
              }
        return m;
          }
    static double multiplication(double[] array)    {
        double m = 1;
        for (int i = 0; i < array.length; i++) {
            m=m*array[i];
        }
        return m;
    }

static int modulus(int array[]){
    int a=array[0]%array[array.length-1];
    return  a;

}
    static double modulus(double array[]){
        double a=array[0]%array[array.length-1];
        return  a;

    }

        static int secondLargest(int array[])    {
        int max1;
        int max2;
        if (array[1]>array[2]){
            max1=array[1];
            max2=array[0];
        } else {
            max2=array[1];
            max1=array[0];
        }
             for (int i = 2; i < array.length; i++) {
            if (array[i]>max1){
                max2=max1;
                max1=array[i];
        }}
        return max2;
    }

    static double secondLargest(double array[])    {
        double max1;
        double max2;
        if (array[1]>array[2]){
            max1=array[1];
            max2=array[0];
        } else {
            max2=array[1];
            max1=array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i]>max1){
                max2=max1;
                max1=array[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int allint;

        double alldb;
        int[] rezAr;
        double[] rezAr1;
        int[] arraint = {-77,1200, 250,7, -2000, -500,4, 3200,15,2,-77,250};
        double [] arraydb = {66.35,-1200.45,- 250.12,7.3, 2000.6, -500,4.5, -3200.9,154.5,2.3};
        allint= modul6.ArraysUtils.sum(arraint);
        System.out.println("sum int ="+allint);
        alldb= modul6.ArraysUtils.sum(arraydb);
        System.out.println("sum double="+ alldb);
        allint= modul6.ArraysUtils.min(arraint);
        System.out.println("min int="+ allint);
        allint= modul6.ArraysUtils.max(arraint);
        System.out.println("max int="+ allint);
        alldb= modul6.ArraysUtils.min(arraydb);
        System.out.println("min double="+ alldb);
        allint = modul6.ArraysUtils.maxPositive(arraint);
        System.out.println("max int Positiv="+ allint);
        alldb= modul6.ArraysUtils.max(arraydb);
        System.out.println("max double="+ alldb);
        alldb = modul6.ArraysUtils.maxPositive(arraydb);
        System.out.println("max double Positiv="+alldb);
        allint=modul6.ArraysUtils.multiplication(arraint);
        System.out.println("mul int ="+ allint);
        alldb=modul6.ArraysUtils.multiplication(arraydb);
        System.out.println("mul double ="+ alldb);
        alldb= modul6.ArraysUtils.modulus(arraydb);
        System.out.println("modus double ="+ alldb);
        allint=modul6.ArraysUtils.modulus(arraint);
        System.out.println("modus int ="+ allint);
        allint=modul6.ArraysUtils.secondLargest(arraint);
        System.out.println("secondLargest int ="+ allint);
        alldb=modul6.ArraysUtils.secondLargest(arraydb);
        System.out.println("secondLargest db ="+ alldb);
        System.out.println(" ");
        System.out.println("findEvenElements");
        for (int i=0;i<arraint.length;i++){
            System.out.print(" "+arraint[i]+" ");

        }
        System.out.println("EvenElements ");
        rezAr= (modul6.ArraysUtils.findEvenElements(arraint));
        for (int i=0;i<rezAr.length;i++){
            System.out.print(" "+rezAr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("reverse");
        System.out.println("arraydb");

        for (int i=0;i<arraydb.length;i++){
            System.out.print(" "+arraydb[i]+" ");

        }
        System.out.println(" ");
        System.out.println("reverse");
        rezAr1= (modul6.ArraysUtils.reverse(arraydb));
        for (int i=0;i<rezAr1.length;i++){
            System.out.print(" "+rezAr1[i]+" ");
        }



    }



}
