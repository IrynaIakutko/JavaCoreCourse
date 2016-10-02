package modul6;


public class ArraysUtils {

   public static int sum(int[] array) {
        int sum = 0;
        int item = 0;

        do {
            sum += array[item];
            item++;
        } while (item < array.length);
        return sum;
    }

    public static int min(int[] array) {
        int minint = array[0];
        int item = 1;

        while (item < array.length) {
            if (minint > array[item]) {
                minint = array[item];
            }
            item++;
        }
        return minint;
    }

    public static int max(int[] array) {
        int maxint = array[0];
        int item = 1;

        while (item < array.length) {
            if (maxint < array[item]) {
                maxint = array[item];
            }
            item++;
        }
        return maxint;
    }

    public static int maxPositive(int[] array) {
        int maxintP = -1;
        int item = 0;

        while (item < array.length) {
            if ((maxintP < array[item]) & (array[item] >= 0)) {
                maxintP = array[item];
            }
            item++;
        }
        return maxintP;
    }

    public static double sum(double[] array) {
        double sum = 0;
        int item = 0;

        do {
            sum += array[item];
            item++;
        } while (item < array.length);
        return sum;
    }

    public static double min(double[] array) {
        double mindouble = array[0];
        int item = 1;

        while (item < array.length) {
            if (mindouble > array[item]) {
                mindouble = array[item];
            }
            item++;
        }
        return mindouble;
    }

    public static double max(double[] array) {
        double maxdouble = array[0];
        int item = 1;

        while (item < array.length) {
            if (maxdouble < array[item]) {
                maxdouble = array[item];
            }
            item++;
        }
        return maxdouble;
    }

    public static double maxPositive(double[] array) {
        double maxdoubleP = array[0];
        int item = 1;

        while (item < array.length) {
            if ((maxdoubleP < array[item]) & (array[item] >= 0)) {
                maxdoubleP = array[item];
            }
            item++;
        }

        return maxdoubleP;

    }

    public static int multiplication(int[] array) {
        int m = 1;
        for (int i = 0; i < array.length; i++) {
            m = m * array[i];
        }
        return m;
    }

    public static double multiplication(double[] array) {
        double m = 1;
        for (int i = 0; i < array.length; i++) {
            m = m * array[i];
        }
        return m;
    }

    public static int modulus(int array[]) {
        int a = array[0] % array[array.length - 1];
        return a;

    }

    public static double modulus(double array[]) {
        double a = array[0] % array[array.length - 1];
        return a;

    }

    public static int secondLargest(int array[]) {
        int max1;
        int max2;
        if (array[1] > array[2]) {
            max1 = array[1];
            max2 = array[0];
        } else {
            max2 = array[1];
            max1 = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            }
        }
        return max2;
    }

    public static double secondLargest(double array[]) {
        double max1;
        double max2;
        if (array[1] > array[2]) {
            max1 = array[1];
            max2 = array[0];
        } else {
            max2 = array[1];
            max1 = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            }
        }
        return max2;
    }

    public static double[] reverse(double array[]) {

        int n = array.length;
        double[] arrayRez = new double[n];
        for (int i = 0; i < n; i++) {
            arrayRez[i] = array[n - i-1];
        }
        return (arrayRez);

    }

    public static int[] findEvenElements(int[] array) {
        int n = array.length;
        int c = 0;
        int[] arrayRez = new int[n];
        for (int l = 0; l < n; l++) {
            for (int i = l+1; i < n; i++) {
                if ((array[l] == array[i]) & !(l == i)) {
                    arrayRez[c] = array[i];
                    c++;
                }
            }

        }
        int[] arrayFin = new int[c];
        for (int l = 0; l < c; l++) {
            arrayFin[l] = arrayRez[l];
        }
        return arrayFin;
    }

}




