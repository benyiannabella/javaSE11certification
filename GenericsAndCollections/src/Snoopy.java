import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

interface Comic<C> {
    void draw(C c);
}

//class SnoopyComic implements Comic<> {
//
//    public void draw(C c) {
//
//        System.out.println(c);
//
//    }
//}

public class Snoopy {
    public static void main(String[] args) {
        Comparator<Integer> c = (x, y) -> x-y;
        var ints = Arrays.asList(3, 4, 1);
        Collections.sort(ints,c);
        System.out.println(ints);
        System.out.println(Collections.binarySearch(ints, 1));
    }

}
