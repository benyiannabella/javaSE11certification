import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        String[] str = new String[]{"hello", "bye"};
        var list = Arrays.asList("hello", "bye");
        Comparator<String>c = (a,b) -> b.compareTo(a);
        Collections.sort(list,c);
        Collections.binarySearch(list,"bye",c);
        System.out.println(list);
//        list.set(0,"hi");
//        System.out.println(list);
    }
}
