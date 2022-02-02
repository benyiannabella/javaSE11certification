import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        Predicate<String> p = (q)->true;

        Supplier<Double> d = ()->3.0;
        double d1 = d.get();
        System.out.println(d.get());

        IntStream i = IntStream.of(1,2,3);
        OptionalInt o = i.min();
        int min = o.getAsInt();
        System.out.println(min);

        String s = new String();
        System.out.println(s);

        List<String> l = new ArrayList<>();
        l.add("hello");
        Supplier<ArrayList> supp = ArrayList::new;
//        l.add(supp.get());
        System.out.println(l);
    }
}
