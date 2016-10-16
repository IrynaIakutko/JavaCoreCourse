package modul8;


import java.util.Collection;

public class stsrtgeneric {
    static <T>  Collection<T> fromArrayToCjlection(T[] arrays, Collection<T> col ){
        for(T el :arrays){
            col.add(el);
        }
        return col;
    }
}
