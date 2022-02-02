import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        var list = List.of(1L,2L,3L,4L,5L);
//        System.out.println(list.stream().count());
//        Stream<Integer> s = Stream.of(1,2,3);
//        System.out.println(s.count());
//
//        List<Integer> l =  Stream.iterate(1, n->n<50, n->n+4).collect(Collectors.toList());
//        l.forEach(System.out :: println);
//
//        Stream<String> myStream = Stream.of("hello", "bye", "goodbye");
//        Optional<String> opt = myStream.min((a, b) -> a.length() - b.length());
//        opt.ifPresent(System.out :: println);

//        Stream<String> st = Stream.of("dog", "cat", "wolf");
//////        st.findFirst().ifPresent(System.out :: println);
////        st.findAny().ifPresent(System.out :: println);
////
////        var list1 = List.of("hello", "no");
////        Predicate<String> p = x->Character.isLetter(x.charAt(0));
////        System.out.println(list1.stream().anyMatch(p));
////        System.out.println(list1.stream().allMatch(p));
////        System.out.println(list1.stream().noneMatch(p));

        var array = new String[]{"w","o","l","f"};
//        System.out.println(Arrays.stream(array).reduce("big ", (a, b) -> a+b));
//        System.out.println(Arrays.stream(array).reduce("big ", String :: concat));
//
//        Optional<String> o = Arrays.stream(array).reduce(String :: concat);
//        o.ifPresent(System.out :: println);
//
//        int length = Arrays.stream(array).reduce(0, (i, s)-> i + s.length(),(a, b)-> a+b);
//        System.out.println(length);

       ArrayList<String> set = Arrays.stream(array).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(set);
    }
}
