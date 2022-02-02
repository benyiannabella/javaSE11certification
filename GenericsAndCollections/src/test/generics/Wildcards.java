package test.generics;

import java.util.ArrayList;
import java.util.List;

class A{}

class B extends A{}

class C extends B{}

public class Wildcards {
    public static void main(String[] args) {
        A a = new A();
        List<?> list = new ArrayList<A>();
//        list.add(a);

        List<? extends A> list2 = new ArrayList<A>();
//        list2.add(a);

        List<? super A> list3 = new ArrayList<A>();
        list3.add(a);

        checks(list2);

    }

    public static  <A> int checks(List<? extends A> list){
        System.out.println(list.size());
        return list.size();
    }
}
