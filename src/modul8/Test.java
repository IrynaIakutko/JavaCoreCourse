package modul8;


import java.util.ArrayList;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        Integer[] array = {1,3,5,7,8,10};
        List<Integer> list = new ArrayList <> ();
        list.add(12);
        System.out.println(stsrtgeneric.fromArrayToCjlection(array,list));
        String[] array1 = {"aa","gg","tt"};
        List<String> list1 = new ArrayList <> ();
        list1.add("gg");
        System.out.println(stsrtgeneric.fromArrayToCjlection(array1,list1));
    }




}
