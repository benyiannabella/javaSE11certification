import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ToMaps {

    public static void main(String[] args) {
        var stream = Stream.of("lions", "tigers", "bears", "cat");
        List<String> list = List.of("lions", "cub", "tigers", "bears", "cat");
        ToMaps.upperCase(list);
//        Map<String, Integer> m = stream.sorted().collect(Collectors.toMap((x)->x, String::length));
//        System.out.println(m);
//
//        Map<Integer, String> map = stream.collect(Collectors.toMap(String::length, x->x, (s1, s2)-> s1 + ", " + s2, TreeMap::new));
//        System.out.println(map);
//        Map<Integer, List<String>> map = stream.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
//        System.out.println(map);

//        Map<Boolean, Set<String>> map = stream.collect(Collectors.partitioningBy(x->x.length()<=5, Collectors.toSet()));
//        System.out.println(map);

//        Map<Integer,Optional<String>> map = stream
//                .collect(Collectors.groupingBy(String::length,
//                        Collectors.mapping(s->s, Collectors.minBy(Comparator.naturalOrder()))));
//        System.out.println(map);


    }

    public static Double average(List<Integer> list){
        return list.stream().mapToDouble(x->x).average().getAsDouble();
    }

    public static List<String> upperCase(List<String> list) {
//        return list.stream()
//                .map(x->x.toUpperCase())
//                .collect(Collectors.toList());


        List<String> l =  list.stream()
                .filter(s -> s.startsWith("c"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(l);
        return l;
    }
}
