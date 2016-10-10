package modul7;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;

public class TaskTest {

        public static void main(String[] args) {

            List<String> stArList = new ArrayList<>();
            List<String> stLinList = new LinkedList<>();
            List<Integer> iArList = new ArrayList<>();
            List<Integer> iLinList = new LinkedList<>();

            int Kol = 1000;
            long start, end;

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.add((int) (Math.random() *303));
            }
            end = System.currentTimeMillis();
            System.out.println("Add  integer ArrayList "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.add((int) (Math.random() * 303));
            }
            end = System.currentTimeMillis();
            System.out.println("Add integer  LinkedList: "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.add("Some String ");
            }
            end = System.currentTimeMillis();
            System.out.println("Add  String  ArrayList: "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.add("Some String ");
            }
            end = System.currentTimeMillis();
            System.out.println("Add  String  LinkedList: " + Kol + + (end - start) );


            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.set(1, (int) (Math.random() +2005));
            }
            end = System.currentTimeMillis();
            System.out.println("Set  Integer  ArrayList: "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.set(1, (int) (Math.random() +2005));
            }
            end = System.currentTimeMillis();
            System.out.println("Set Integer  LinkedList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.set(1, "String  ArrayList");
            }
            end = System.currentTimeMillis();
            System.out.println("Set  String  ArrayList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.set(1, "String  LinkedList");
            }
            end = System.currentTimeMillis();
            System.out.println("Set String  LinkedList: "+ Kol +"  " +  (end - start) + "\n");

            //Get
            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get Integer  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  Integer  LinkedList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  String  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  String  LinkedList: "+ Kol +"  " +  (end - start) + "\n");

            //Remove
            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  Integer  ArrayList: "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  Integer  LinkedList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  String  ArrayList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  String  LinkedList: " + Kol +"  " + (end - start) + "\n");

            //*************************************************    add

            Kol = 10000;
            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.add((int) (Math.random() * 1001));
            }
            end = System.currentTimeMillis();
            System.out.println("Add  Integer  ArrayList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.add((int) (Math.random() * 1001));
            }
            end = System.currentTimeMillis();
            System.out.println("Add  Integer  LinkedList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.add("some String  ArrayList");
            }
            end = System.currentTimeMillis();
            System.out.println("Add  String  ArrayList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.add("Some  LinkedList");
            }
            end = System.currentTimeMillis();
            System.out.println("Add  String  LinkedList: "+ Kol +"  " +  (end - start) + "\n");

            //*************************************************    set
            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.set(1, (int) (Math.random() * 1001));
            }
            end = System.currentTimeMillis();
            System.out.println("Set Integer  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.set(1, (int) (Math.random() * 1001));
            }
            end = System.currentTimeMillis();
            System.out.println("Set  Integer  LinkedList: "+ Kol +"  " + (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.set(1, "String  ArrayList");
            }
            end = System.currentTimeMillis();
            System.out.println("Set  String  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.set(1, "String  LinkedList");
            }
            end = System.currentTimeMillis();
            System.out.println("Set  String  LinkedList: "+ Kol +"  " +  (end - start) + "\n");
            //*************************************************    get
            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  Integer  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  Integer  LinkedList: "+ Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get  String  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.get(1);
            }
            end = System.currentTimeMillis();
            System.out.println("Get String  LinkedList: "+ Kol +"  " +  (end - start) + "\n");
//*************************************************    remove
             start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iArList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  Integer  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                iLinList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  Integer  LinkedList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stArList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  String  ArrayList: " + Kol +"  " +  (end - start));

            start = System.currentTimeMillis();
            for (int i = 0; i < Kol; i++) {
                stLinList.remove(0);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove  String  LinkedList: "+ Kol +"  " +  (end - start));
        }
    }


