package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        getString(Arrays.asList(3,44));
//        System.out.println(Stream.iterate(1, x -> ++x)
//                .limit(5).map(x -> "" + x)
//                .collect(Collectors.joining()));
//
//        Optional<String> o = Optional.empty();
//        o.orElseThrow(()-> new RuntimeException());
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream()
                .flatMap(x-> x.stream())
                .collect(Collectors.toList());
    }

    public static Person getOldestPerson(List<Person> people) {

       Person p = people.stream()
                .max((a,b)->a.getAge()-b.getAge())
                .get();
        System.out.println(p);
       return p;
    }

    public static String namesToString(List<Person> people) {

        return people.stream()
                .map(x-> x.getName())
                .collect(Collectors.joining(", ", "Names: ", "."));

    }

    public static String getString(List<Integer> list) {
        String s = list.stream()
                .map(x-> x%2==0 ? "e"+x : "o"+x)
                .collect(Collectors.joining(","));
        System.out.println(s);
        return s;
    }
}
