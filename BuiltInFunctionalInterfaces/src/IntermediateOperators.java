import java.util.*;
import java.util.stream.Stream;

public class IntermediateOperators {

    public static void main(String[] args) {

//        List<String> list = List.of("month", "baby","milk", "mother", "ball", "month", "baby");
////        list.stream().filter(x-> x.toLowerCase().startsWith("m")).forEach(System.out::println);
//        System.out.println(list.stream().distinct().filter(x-> x.toLowerCase().startsWith("m")).count());
//
//        Stream<Integer> s = Stream.iterate(1, n-> n+1);
//        s.skip(5).limit(2).forEach(System.out::println);
//
//        Stream<String> ss = Stream.of("hello", "good evening", "goodbye");
//        ss.map(String :: length).forEach(System.out :: print);

        List<String> list = List.of();
        var list1 = List.of("chimpanzee");
        var list2 = List.of("mama gorilla", "baby gorilla");
        Stream<List<String>> listsCombined = Stream.of(list, list1, list2);
        listsCombined.flatMap(Collection::stream).sorted(Comparator.reverseOrder()).forEach(System.out :: println);

    }
}
