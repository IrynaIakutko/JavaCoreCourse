package modul3.task2;
 public class Main {   public static void main(String[] args) {
    Arithmetic ar=new Arithmetic(4,9);

    int rez1 = ar.add();

    Adder ad1 =new Adder(4,9);

    System.out.println(rez1);

    boolean z=ad1.check();

    System.out.println(z);



}
}
