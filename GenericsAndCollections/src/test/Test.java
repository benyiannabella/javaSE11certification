package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
//        var map = new HashMap<Integer, Integer>(10);
//        for(int i = 1; i <=10; i++){
//            map.put(i, i*i);
//        }
//        System.out.println(map.get(4));


        Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
        var list = Arrays.asList(5, 4, 7, 2);
        Comparator<Integer> c2 = Comparator.naturalOrder();
        Comparator<Integer> c3 = Comparator.reverseOrder();
        Collections.sort(list,c2);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 2));
    }

}
