import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AList {
    public static void main(String[] args) {
        ArrayList lists = new ArrayList();
        ArrayList lists1 = new ArrayList(10);
        ArrayList lists2 = new ArrayList(lists1);

        lists.add(1);
        lists.add('a');
        lists.add("abc");
        lists.add(true);
//        System.out.println(lists.toString());

        List<String> list1 = new ArrayList<>();

        var myList = new ArrayList<>();
        myList.add("abc");
        for(Object s : myList){
//            System.out.println(s);
        }

        list1.add("hawk");
        list1.add(1, "sparrow");
        list1.add(0, "pelican");
//        System.out.println(list1);

//        System.out.println(list1.remove("pigeon"));
//        System.out.println(list1.remove("pelican"));

        list1.remove(1);
//        System.out.println(list1);
        list1.add("hawk");
//        System.out.println(list1);
//        System.out.println(list1.set(1, "sparrow"));

//        System.out.println(list1.isEmpty());
//        System.out.println(list1.size());
//        list1.clear();
//        System.out.println(list1);
//        System.out.println(list1.isEmpty());
//        System.out.println(list1.size());

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
//        System.out.println(one.equals(two));
        one.add("a");
        one.add("b");
//        System.out.println(one);
        two.add("b");
        two.add("a");
//        System.out.println(two);
//        System.out.println(one.equals(two));

        //from list to array toArrays();
        String[] a = list1.toArray(new String[0]);
        for(String s : a){
//            System.out.println(s);
        }

        a[0] = "test";

        //from array to list Arrays.asList
        String[] arr = new String[]{"hawk", "sparrow"};
        List<String> myArr = Arrays.asList(arr);
        myArr.set(0, "changed");
        arr[1] = "changed by array";


        List<String> sl = List.of(arr);

        arr[0] = "changed again";
        System.out.println(myArr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sl);

        List<String> myList1 = Arrays.asList("one”", "“two”");
        List<String> myList2 = List.of("“one”", "“two”");
        System.out.println(myList1 + " ______" + myList2);

        List<String> l = new ArrayList<>(myList1);

        l.remove(0);
        System.out.println(l);
        System.out.println(Arrays.toString(a));
//        myList2.add("test1");


        List planets = new ArrayList<>();
        planets.add(5);

        var friends = List.of(new Object(),
                new String("hello"));

    }
}
