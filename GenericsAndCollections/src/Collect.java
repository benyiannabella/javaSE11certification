import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Collect {

    public static void testing(List<Integer> l, Consumer<List<Integer>> c){
        c.accept(l);
    }

    public static void impl(List<Integer> l){
        Consumer<List<Integer>> c = Collections :: sort;
        testing(l, c);
    }
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(55);
        i.add(23);
        i.add(5);
        Collect.impl(i);
        System.out.println(i);

    }
}
