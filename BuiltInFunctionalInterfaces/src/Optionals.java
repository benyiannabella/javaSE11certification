import java.util.Optional;
import java.util.stream.Stream;

public class Optionals {

    public static Optional<Double> average(int... grades){
        if(grades.length == 0) return Optional.empty();
        int sum =0;
        for(int grade : grades) sum+= grade;
        return Optional.of((double) sum / grades.length);
    }

    public static void main(String[] args) {
//        System.out.println(average());
//        Optional<Double> check = average(90, 100);
//
//        System.out.println(check.orElse(1.0));
//        System.out.println(check.orElseGet(()-> Math.random() * 10));
//        check.orElseThrow(() -> new IllegalArgumentException());
//        if(check.isPresent()) System.out.println(check.get());
//        Optional<Double> opt = average(90, 100);
//        opt.ifPresent(System.out::println);

        Optional<Integer> o = Optional.of(123);
        o.map(x->""+x).filter(x->x.length() == 3).ifPresent(System.out::println);

        Stream<Integer> s = Stream.of(123, 12, 3, 456);
        s.map(x->""+x).filter(x->x.length() == 3).forEach(System.out::println);

        Optional<String> o2 = Optional.of("hello");
//        Optional<Integer> oi = o2.map(String::length);
//        oi.ifPresent(System.out::println);


    }
}
