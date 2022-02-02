package test.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckNull implements Comparable<DuckNull>{
    String name;

    public DuckNull(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(DuckNull o) {
        if(o == null) throw new IllegalArgumentException("no argument duck object");
        if(this.name == null && o.name == null) return 0;
        else if(this.name == null) return -1;
        else if(o.name == null) return 1;
        else return name.compareTo(o.name);
    }

//    //if class implements not generic Comparable we need to cast
//    @Override
//    public int compareTo(Object o) {
//        DuckNull d = (DuckNull) o;
//        return name.compareTo(d.name);
//    }

    @Override
    public String toString() {
        return "name='" + name;
    }

    public static void main(String[] args) {
        List<DuckNull> l = new ArrayList<>();

//        l.add(new DuckNull(null));
        DuckNull d = null;
        l.add(d);
        l.add(new DuckNull("Agnes"));
        Collections.sort(l);
        System.out.println(l);
    }


}
