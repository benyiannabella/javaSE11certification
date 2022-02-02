package test.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck>{

    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Duck o) {
      return name.compareTo(o.name);
    }


//    @Override
//    public int compareTo(Duck o) {
////        return o.age - this.age;
////        return this.age - o.age;
//        return Integer.compare(o.age, age);
//    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Duck name: " + name;
    }

    public static int comparing(Duck d1, Duck d2, Comparator<Duck> c){
        return c.compare(d1, d2);
    }

    public static void main(String[] args) {
        List<Duck> ducks =  new ArrayList<>();
        Duck d1 = new Duck("Puddles", 5);
        Duck d2 = new Duck("Quacky", 3);
        ducks.add(d1);
        ducks.add(d2);
        Collections.sort(ducks);
        System.out.println("sort by name with comparable: " + ducks);

//        Comparator<Duck> c = (duck1, duck2) ->duck1.age - duck2.age;

        Comparator<Duck> c = Comparator.comparing(Duck :: getAge);

        Collections.sort(ducks,c);
        System.out.println("Sort by age with Comparator: " + ducks);

    }


}
