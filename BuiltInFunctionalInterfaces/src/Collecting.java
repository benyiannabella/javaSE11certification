import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collecting {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("hello", "bye", "goodbye");
        String joined = s.collect(Collectors.joining(", "));
        System.out.println(joined);

        Stream<String> s1 = Stream.of("hello", "bye", "goodbye");
//        Stream<Integer> si = s1.sorted((a,b)-> a.length() - b.length()).map(x->x.length());
//        ArrayList<Integer> a = si.collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(a);
//       Double d=  s1.collect(Collectors.averagingInt(String::length));
//        System.out.println(d);
        System.out.println(s1.collect(Collectors.minBy(Comparator.naturalOrder())));

    }
}
