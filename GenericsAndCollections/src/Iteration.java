import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {
        List<String> i = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        i.add("hi");
        i.add("hello");
        i.add("bye");
        list.add(Integer.valueOf(5));
        list.add(Integer.valueOf(15));
        list.add(Integer.valueOf(20));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + ", ");
        }

    }
}
