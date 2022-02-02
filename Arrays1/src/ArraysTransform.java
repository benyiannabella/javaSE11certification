import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraysTransform {
    public static void main(String[] args) {

        Integer[] inta = new Integer[10];
        Integer[] newInt = Arrays.copyOf(inta, inta.length);
        Integer[] newInt1 = Arrays.copyOf(inta, 5);


        System.out.println(Arrays.toString(inta));
        System.out.println(Arrays.toString(newInt));
        System.out.println(Arrays.toString(newInt1));
        newInt1 =Arrays.copyOf(newInt, 15);
        System.out.println(Arrays.toString(newInt1));

        Arrays.fill(inta, 5);

        List lists = Arrays.asList(inta);
        lists.set(0, 3);
        List shortList = lists.subList(0,3);
        System.out.println("short " + shortList);

        Integer[] nInt = new Integer[10];
        shortList.toArray(nInt);
        System.out.println(Arrays.toString(nInt));


        for(Iterator it = lists.iterator(); it.hasNext();){
            System.out.print(it.next());
        }

        ListIterator lIt = lists.listIterator();
        for(int i = 0 ; lIt.hasNext(); i++){
            System.out.print(lIt.next());
        }

        System.out.println(nInt.length);
    }
}
